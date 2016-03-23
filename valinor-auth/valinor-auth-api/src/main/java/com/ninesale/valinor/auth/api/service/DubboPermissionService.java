package com.ninesale.valinor.auth.api.service;

import java.util.List;

import com.ninesale.valinor.auth.api.model.Permission;

/**
 * 权限 业务接口
 * 
 * @author StarZou
 * @since 2014年6月10日 下午12:02:39
 **/

public interface DubboPermissionService {

	/**
	 * 通过角色id 查询角色 拥有的权限
	 * 
	 * @param roleId
	 * @return
	 */
	List<Permission> getPermissionsByRoleId(Integer roleId);

}
