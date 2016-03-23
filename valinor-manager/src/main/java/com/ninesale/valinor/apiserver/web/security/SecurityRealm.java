package com.ninesale.valinor.apiserver.web.security;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;

import com.ninesale.valinor.auth.api.model.Permission;
import com.ninesale.valinor.auth.api.model.Role;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.request.DubboLoginRequest;
import com.ninesale.valinor.auth.api.model.request.DubboUserNameRequest;
import com.ninesale.valinor.auth.api.model.response.DubboUserResponse;
import com.ninesale.valinor.auth.api.service.DubboAuthService;
import com.ninesale.valinor.auth.api.service.DubboPermissionService;
import com.ninesale.valinor.auth.api.service.DubboRoleService;
import com.pubpi.common.utils.HashUtils;
import com.pubpi.common.utils.StringUtils;

/**
 * 用户身份验证,授权 Realm 组件
 * 
 * @author wangtonghuan
 *
 */
@Component(value = "securityRealm")
public class SecurityRealm extends AuthorizingRealm {
	@Resource
	private DubboAuthService dubboAuthService;

	@Resource
	private DubboRoleService dubboRoleService;

	@Resource
	private DubboPermissionService dubboPermissionService;

	/**
	 * 权限检查
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		String username = String.valueOf(principals.getPrimaryPrincipal());

		DubboUserNameRequest req = new DubboUserNameRequest();
		req.setUsername(username);
		final DubboUserResponse response = dubboAuthService.getUserByUsername(req);
		User user = response.getData();
		final List<Role> roleInfos = dubboRoleService.getRolesByUserId(user.getId());
		for (Role role : roleInfos) {
			authorizationInfo.addRole(role.getRoleSign());

			final List<Permission> permissions = dubboPermissionService.getPermissionsByRoleId(role.getId());
			for (Permission permission : permissions) {
				if (!StringUtils.isNull(permission.getPermissionSign())) {
					authorizationInfo.addStringPermission(permission.getPermissionSign());
				}
			}
		}
		return authorizationInfo;
	}

	/**
	 * 登录鉴权
	 */
	@Override
	public AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = String.valueOf(token.getPrincipal());
		String password = new String((char[]) token.getCredentials());
		Subject subject = SecurityUtils.getSubject();
		String random = (String) subject.getSession().getAttribute("login_random");
		subject.getSession().removeAttribute("login_random");

		if (StringUtils.isNull(username) || StringUtils.isNull(password)) {
			throw new AuthenticationException("用户名或密码为空");
		}

		DubboLoginRequest req = new DubboLoginRequest();
		req.setUsername(username);
		req.setPassword(password);

		// 通过数据库进行验证
		DubboUserResponse userResp = dubboAuthService.login(req);
		User authentication = userResp.getData();
		if (authentication == null) {
			throw new AuthenticationException("用户不存在");
		}
		
		//pbkdf2验证
//		try {
//			if(!PasswordHash.validatePassword(password, authentication.getPassword())){
//				throw new AuthenticationException("鉴权失败");
//			}
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		} catch (InvalidKeySpecException e) {
//			e.printStackTrace();
//		}
		if (StringUtils.isBlank(random) || 
			!HashUtils.hmacsha256(authentication.getPassword(), random).equals(password)) {
			throw new AuthenticationException("鉴权失败");
		}

		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, getName());
		return authenticationInfo;
	}
}
