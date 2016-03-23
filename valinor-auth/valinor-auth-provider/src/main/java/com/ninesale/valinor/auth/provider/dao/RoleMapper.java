package com.ninesale.valinor.auth.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.auth.api.model.Role;

/**
 * 
 * @author hawk
 *
 */
public interface RoleMapper {

	int deleteByPrimaryKey(Long id);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);

	/**
	 * 通过用户id 查询用户 拥有的角色
	 * 
	 * @param id
	 * @return
	 */
	List<Role> getRolesByUserId(Long userId);

	/**
	 * 添加用户与角色的对应关系
	 * 
	 * @param userId
	 * @param roleId
	 */
	void addUserToRoleInfo(@Param("userId") Long userId, @Param("roleId") int roleId);
}