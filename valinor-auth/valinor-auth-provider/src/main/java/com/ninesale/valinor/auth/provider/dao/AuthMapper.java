package com.ninesale.valinor.auth.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.auth.api.model.DtoContacts;
import com.ninesale.valinor.auth.api.model.DtoOpenInfo;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.WeixinUser;
import com.ninesale.valinor.auth.api.model.request.DubboConstactsRequest;
import com.ninesale.valinor.auth.provider.model.DtoUser;

/**
 * 
 * @author hawk
 *
 */
public interface AuthMapper {
	int countByExample(User example);

	int deleteByExample(User example);

	int deleteByPrimaryKey(Long id);

	Long insertUser(DtoUser record);

	int insertSelective(User record);
	
	List<User> getUserByModel(User user);

	List<User> getManagerByModel(User user);

	User selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") User record, @Param("example") User example);

	int updateByExample(@Param("record") User record, @Param("example") User example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	/**
	 * 用户登录验证查询
	 * 
	 * @param record
	 * @return
	 */
	User authentication(@Param("record") User record);
	
	User managerAuthentication(@Param("record") User record);

	List<User> getUserListByParentIdWithPage(@Param("user") User user, @Param("beginId") int beginId, @Param("pageSize") int pageSize);

	/**
	 * 获取用户数量
	 * 
	 * @param user
	 * @return
	 */
	Long getUserCountByParentId(@Param("user") User user);

	void addOpenId(WeixinUser weixinUser);

	void delWeixinUser(WeixinUser weixinUser);

	List<WeixinUser> getWeixinUser(WeixinUser weixinUser);

	void addContactInfo(String contactInfo);
	/**
	 * 删除用户对应角色
	 * @param userId
	 */
	void deleteUserRole(@Param("userId") Long userId);
	
	/**
	 * 添加联系人信息
	 * @param request
	 */
	void replaceContacts(DubboConstactsRequest request);

	/**
	 * 获取联系人信息
	 * @param userId
	 * @return
	 */
	List<DtoContacts> getContacts(Long userId);

	/**
	 * 获取第三方绑定信息
	 * @param userId
	 * @return
	 */
	List<DtoOpenInfo> getOpenInfo(Long userId);

	/**
	 * 根据用户Id获取用户信息
	 * @param userIdList
	 * @return
	 */
	List<User> getUserListById(List<Long> userIdList);
}