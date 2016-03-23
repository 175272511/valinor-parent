package com.ninesale.valinor.userinfo.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ninesale.valinor.userinfo.api.model.DtoConcernNote;
import com.ninesale.valinor.userinfo.api.model.DtoConcernPerson;
import com.ninesale.valinor.userinfo.api.model.DtoConcernTag;
import com.ninesale.valinor.userinfo.api.model.DtoUserAddress;
import com.ninesale.valinor.userinfo.api.model.DtoUserCollect;
import com.ninesale.valinor.userinfo.api.model.DtoUserCount;
import com.ninesale.valinor.userinfo.api.model.DtoUserOrderInfo;
import com.ninesale.valinor.userinfo.api.model.DtoUserPoints;
import com.ninesale.valinor.userinfo.api.model.DtoUserReceipt;
import com.ninesale.valinor.userinfo.api.model.DtoUserWallet;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernPersonListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagRequest;

/**
 * 
 * @author hawk
 *
 */
public interface UserMapper {

	void insertUserAddress(DtoUserAddress adress);

	List<DtoUserAddress> getUserAddress(DtoUserAddress adress);

	void updateUserAddress(DtoUserAddress adress);

	/**
	 * 查询用户积分
	 * 
	 * @param userId
	 * @return
	 */
	DtoUserPoints getUserPoints(Long userId);

	/**
	 * 查询用户发票信息
	 * 
	 * @param userId
	 * @return
	 */
	List<DtoUserReceipt> getUserReceipt(Long userId);

	/**
	 * 添加用户发票
	 * 
	 * @param receipt
	 */
	void insertUserReceipt(DtoUserReceipt receipt);

	/**
	 * @param receipt
	 */
	void deleteUserReceipt(DtoUserReceipt receipt);

	/**
	 * @param userId
	 * @param beginId
	 * @param pageSize
	 * @return
	 */
	List<DtoUserOrderInfo> getUserOrderInfo(@Param("userId") Long userId, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param userId
	 * @return
	 */
	Integer getUserOrderCount(Long userId);

	/**
	 * @param userId
	 * @param beginId
	 * @param pageSize
	 * @return
	 */
	List<DtoUserCollect> getUserCollect(@Param("userId") Long userId, @Param("beginId") Integer beginId, @Param("pageSize") Integer pageSize);

	/**
	 * @param userId
	 * @return
	 */
	Integer getUserCollectCount(Long userId);

	/**
	 * @param userId
	 * @return
	 */
	DtoUserWallet getUserWallet(Long userId);

	/**
	 * @param userId
	 * @return
	 */
	List<DtoUserCollect> getSkuIdByUserId(Long userId);

	/**
	 * @param userId
	 * @return
	 */
	DtoUserCount getPersonCount(Long userId);

	/**
	 * @param userId
	 */
	void insertUserCount(Long userId);

	/**
	 * @param request
	 */
	void insertConcernPerson(DubboConcernRequest request);

	/**
	 * @param userId
	 */
	void insertPersonConcern(Long userId);

	/**
	 * @param concernId
	 */
	void insertPersonFans(Long concernId);

	/**
	 * @param request
	 */
	void deleteConcernPerson(DubboConcernRequest request);

	/**
	 * @param userId
	 */
	void deletePersonConcern(Long userId);

	/**
	 * @param concernId
	 */
	void deletePersonFans(Long concernId);

	/**
	 * @param request
	 */
	void insertNotePerson(DubboConcernNoteRequest request);

	/**
	 * @param request
	 */
	void deleteNotePerson(DubboConcernNoteRequest request);

	/**
	 * @param request
	 */
	void insertTagPerson(DubboConcernTagRequest request);

	/**
	 * @param request
	 */
	void deleteTagPerson(DubboConcernTagRequest request);

	/**
	 * @return
	 */
	List<DtoConcernPerson> getConcernPersonList(DubboConcernPersonListRequest request);

	/**
	 * @param userId
	 * @return
	 */
	int getConcernPersonCount(Long userId);

	/**
	 * @param request
	 * @return
	 */
	List<DtoConcernNote> getConcernNoteList(DubboConcernNoteListRequest request);

	/**
	 * @param userId
	 * @return
	 */
	int getConcernNoteCount(Long userId);

	/**
	 * @param userId
	 * @return
	 */
	List<DtoConcernTag> getConcernTagList(Long userId);

}