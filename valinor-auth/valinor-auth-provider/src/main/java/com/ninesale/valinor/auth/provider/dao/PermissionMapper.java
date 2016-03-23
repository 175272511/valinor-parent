package com.ninesale.valinor.auth.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.auth.api.model.Permission;
import com.ninesale.valinor.auth.api.model.Role;

/**
 * 
 * @author hawk
 *
 */
public interface PermissionMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Permission record);

	int insertSelective(Permission record);

	Permission selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Permission record);

	int updateByPrimaryKey(Permission record);

	/**
	 * 通过角色id 查询角色 拥有的权限
	 * 
	 * @param roleId
	 * @return
	 */
	List<Permission> getPermissionsByRoleId(@Param("roleId") Integer roleId);

	/**
	 * 获取权限列表
	 * 
	 * @param role
	 * @return
	 */
	List<Permission> getPermissions(Role role);
}