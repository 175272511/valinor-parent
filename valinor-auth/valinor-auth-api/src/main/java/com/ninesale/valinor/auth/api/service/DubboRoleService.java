package com.ninesale.valinor.auth.api.service;

import java.util.List;

import com.ninesale.valinor.auth.api.model.Role;

/**
 * 角色管理service
 * 
 * @author hawk
 *
 */

public interface DubboRoleService {

	/**
	 * 根据用户查询角色 一个用户可以对应多个角色
	 * 
	 * @param userId
	 * @return
	 */
	List<Role> getRolesByUserId(Long userId);
}
