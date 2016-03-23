package com.ninesale.valinor.auth.provider.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ninesale.valinor.auth.api.model.Role;
import com.ninesale.valinor.auth.api.service.DubboRoleService;
import com.ninesale.valinor.auth.provider.dao.RoleMapper;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service("dubboRoleService")
public class DubboRoleServiceImpl implements DubboRoleService {
	@Resource
	private RoleMapper roleMapper;

	@Override
	public List<Role> getRolesByUserId(Long userId) {
		return roleMapper.getRolesByUserId(userId);
	}
}
