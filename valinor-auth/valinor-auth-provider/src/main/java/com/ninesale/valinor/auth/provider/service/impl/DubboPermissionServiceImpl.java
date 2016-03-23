package com.ninesale.valinor.auth.provider.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ninesale.valinor.auth.api.model.Permission;
import com.ninesale.valinor.auth.api.service.DubboPermissionService;
import com.ninesale.valinor.auth.provider.dao.PermissionMapper;

/**
 * 权限Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午12:05:03
 */
@Service("dubboPermissionService")
public class DubboPermissionServiceImpl implements DubboPermissionService {

	@Resource
	private PermissionMapper permissionMapper;

	@Override
	public List<Permission> getPermissionsByRoleId(Integer roleId) {
		return permissionMapper.getPermissionsByRoleId(roleId);
	}
}
