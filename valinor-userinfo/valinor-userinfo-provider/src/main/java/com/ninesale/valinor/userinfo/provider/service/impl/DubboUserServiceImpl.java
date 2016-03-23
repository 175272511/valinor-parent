package com.ninesale.valinor.userinfo.provider.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
import com.ninesale.valinor.userinfo.api.model.request.DubboAddUserAddressRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboAddUserReceiptRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernNoteRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernPersonListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagListRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboConcernTagRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboDelUserReceiptRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetAddressRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCollectRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetUserCountRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboGetUserOrderInfoRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboReceiptRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboUserPointsRequest;
import com.ninesale.valinor.userinfo.api.model.request.DubboUserWalletRequest;
import com.ninesale.valinor.userinfo.api.model.response.DubboAddUserAddressResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboAddUserReceiptResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernNoteListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernPersonListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboConcernTagListResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboDelUserReceiptResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetAddressResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetUserCollectResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetUserCountResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboGetUserOrderInfoResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboReceiptResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboUserPointsResponse;
import com.ninesale.valinor.userinfo.api.model.response.DubboUserWalletResponse;
import com.ninesale.valinor.userinfo.api.service.DubboUserService;
import com.ninesale.valinor.userinfo.provider.dao.UserMapper;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;
import com.pubpi.valinor.dubbo.base.model.DubboReturnCode;

@Service("dubboUserService")
public class DubboUserServiceImpl implements DubboUserService {

	private static final Logger logger = LoggerFactory.getLogger(DubboUserServiceImpl.class);

	@Resource
	private UserMapper userMapper;

	@Override
	public DubboAddUserAddressResponse addUserAddress(DubboAddUserAddressRequest request) throws Exception {
		DtoUserAddress adress = BeanMapper.map(request, DtoUserAddress.class);
		try {
			userMapper.insertUserAddress(adress);
		}
		catch (Exception e) {
			logger.error("addUserAdress dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		return new DubboAddUserAddressResponse(DubboReturnCode.SUCCESS, "success", request.getTid());
	}

	@Override
	public DubboGetAddressResponse getUserAddress(DubboGetAddressRequest request) throws Exception {
		DtoUserAddress adress = BeanMapper.map(request, DtoUserAddress.class);

		DubboGetAddressResponse response = new DubboGetAddressResponse();
		List<DtoUserAddress> data = null;
		try {
			data = userMapper.getUserAddress(adress);
		}
		catch (Exception e) {
			logger.error("getUserAddress dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setData(data);
		return response;
	}

	@Override
	public DubboAddUserAddressResponse updateUserAddress(DubboAddUserAddressRequest request) throws Exception {
		DtoUserAddress adress = BeanMapper.map(request, DtoUserAddress.class);
		try {
			userMapper.updateUserAddress(adress);
		}
		catch (Exception e) {
			logger.error("updateUserAddress dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		return new DubboAddUserAddressResponse(DubboReturnCode.SUCCESS, "success", request.getTid());
	}

	@Override
	public DubboUserPointsResponse getUserPoints(DubboUserPointsRequest request) throws Exception {
		DtoUserPoints points = null;

		try {
			points = userMapper.getUserPoints(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getUserPoints dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboUserPointsResponse response = new DubboUserPointsResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setData(points);
		return response;
	}

	@Override
	public DubboReceiptResponse getUserReceipt(DubboReceiptRequest request) throws Exception {
		List<DtoUserReceipt> receipt = null;

		try {
			receipt = userMapper.getUserReceipt(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getUserReceipt dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboReceiptResponse response = new DubboReceiptResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setData(receipt);
		return response;
	}

	@Override
	public DubboAddUserReceiptResponse addUserReceipt(DubboAddUserReceiptRequest request) throws Exception {
		DtoUserReceipt receipt = BeanMapper.map(request, DtoUserReceipt.class);
		try {
			userMapper.insertUserReceipt(receipt);
		}
		catch (Exception e) {
			logger.error("addUserReceipt dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		return new DubboAddUserReceiptResponse(DubboReturnCode.SUCCESS, "success", request.getTid());
	}

	@Override
	public DubboDelUserReceiptResponse delUserReceipt(DubboDelUserReceiptRequest request) throws Exception {
		DtoUserReceipt receipt = new DtoUserReceipt();
		receipt.setId(request.getId());
		receipt.setUserId(request.getUserId());
		try {
			userMapper.deleteUserReceipt(receipt);
		}
		catch (Exception e) {
			logger.error("delUserReceipt dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		return new DubboDelUserReceiptResponse(DubboReturnCode.SUCCESS, "success", request.getTid());
	}

	@Override
	public DubboGetUserOrderInfoResponse getUserOrderInfo(DubboGetUserOrderInfoRequest request) throws Exception {

		List<DtoUserOrderInfo> list = null;
		Integer count = null;

		try {
			list = userMapper.getUserOrderInfo(request.getUserId(), request.getBeginId(), request.getPageSize());
			count = userMapper.getUserOrderCount(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getUserOrderInfo dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboGetUserOrderInfoResponse response = new DubboGetUserOrderInfoResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setCurrentPage(request.getCurrentPage());
		response.setPageSize(request.getPageSize());
		response.setTotalNum(count);
		response.setData(list);
		return response;
	}

	@Override
	public DubboGetUserCollectResponse getUserCollect(DubboGetUserCollectRequest request) throws Exception {

		List<DtoUserCollect> list = null;
		Integer count = null;

		try {
			list = userMapper.getUserCollect(request.getUserId(), request.getBeginId(), request.getPageSize());
			count = userMapper.getUserCollectCount(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getUserOrderInfo dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboGetUserCollectResponse response = new DubboGetUserCollectResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setCurrentPage(request.getCurrentPage());
		response.setPageSize(request.getPageSize());
		response.setTotalNum(count);
		response.setData(list);
		return response;
	}

	@Override
	public DubboUserWalletResponse getUserWallet(DubboUserWalletRequest request) throws Exception {
		DtoUserWallet wallet = null;

		try {
			wallet = userMapper.getUserWallet(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getUserWallet dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboUserWalletResponse response = new DubboUserWalletResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setData(wallet);
		return response;
	}

	@Override
	public DubboGetUserCollectResponse getSkuIdByUserId(DubboGetUserCollectRequest request) {
		List<DtoUserCollect> list = null;
		try {
			list = userMapper.getSkuIdByUserId(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getSkuIdByUserId dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboGetUserCollectResponse response = new DubboGetUserCollectResponse();
		response.setTid(request.getTid());
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(list);
		return response;
	}

	@Override
	public DubboGetUserCountResponse getPersonCount(DubboGetUserCountRequest request) throws Exception {
		DtoUserCount data = null;
		try {
			data = userMapper.getPersonCount(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getPersonCount dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboGetUserCountResponse response = new DubboGetUserCountResponse();
		response.setCode(DubboReturnCode.SUCCESS);
		response.setTid(request.getTid());
		response.setData(data);
		return response;
	}

	@Override
	public DubboBasicResponse addPersonCount(DubboGetUserCountRequest cRequest) {
		try {
			userMapper.insertUserCount(cRequest.getUserId());
		}
		catch (Exception e) {
			logger.error("addPersonCount dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	@Transactional
	public DubboBasicResponse concern(DubboConcernRequest request) {
		try {
			// 增加关注表
			userMapper.insertConcernPerson(request);
			// 增加关注数
			userMapper.insertPersonConcern(request.getUserId());
			// 增加被关注人粉丝数
			userMapper.insertPersonFans(request.getConcernId());
		}
		catch (Exception e) {
			logger.error("concern dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	@Transactional
	public DubboBasicResponse cancelConcern(DubboConcernRequest request) {
		try {
			// 减少关注表
			userMapper.deleteConcernPerson(request);
			// 减少关注数
			userMapper.deletePersonConcern(request.getUserId());
			// 减少被关注人粉丝数
			userMapper.deletePersonFans(request.getConcernId());
		}
		catch (Exception e) {
			logger.error("cancelConcern dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboBasicResponse concernNote(DubboConcernNoteRequest request) {
		try {
			userMapper.insertNotePerson(request);
		}
		catch (Exception e) {
			logger.error("concernNote dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboBasicResponse cancelConcernNote(DubboConcernNoteRequest request) throws Exception {
		try {
			userMapper.deleteNotePerson(request);
		}
		catch (Exception e) {
			logger.error("cancelConcernNote dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboBasicResponse concernTag(DubboConcernTagRequest request) throws Exception {
		try {
			userMapper.insertTagPerson(request);
		}
		catch (Exception e) {
			logger.error("concernTag dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboBasicResponse cancelConcernTag(DubboConcernTagRequest request) throws Exception {
		try {
			userMapper.deleteTagPerson(request);
		}
		catch (Exception e) {
			logger.error("cancelConcernTag dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}
		return new DubboBasicResponse(DubboReturnCode.SUCCESS, "");
	}

	@Override
	public DubboConcernPersonListResponse getConcernPersonList(DubboConcernPersonListRequest request) {
		List<DtoConcernPerson> data = null;
		int totalNum = 0;
		try {
			data = userMapper.getConcernPersonList(request);
			totalNum = userMapper.getConcernPersonCount(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getConcernPersonList dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboConcernPersonListResponse response = BeanMapper.map(request, DubboConcernPersonListResponse.class);
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(data);
		response.setTotalNum(totalNum);
		return response;
	}

	@Override
	public DubboConcernNoteListResponse getConcernNoteList(DubboConcernNoteListRequest request) throws Exception {
		List<DtoConcernNote> data = null;
		int totalNum = 0;
		try {
			data = userMapper.getConcernNoteList(request);
			totalNum = userMapper.getConcernNoteCount(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getConcernNoteList dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboConcernNoteListResponse response = BeanMapper.map(request, DubboConcernNoteListResponse.class);
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(data);
		response.setTotalNum(totalNum);
		return response;
	}

	@Override
	public DubboConcernTagListResponse getConcernTagList(DubboConcernTagListRequest request) throws Exception {
		List<DtoConcernTag> data = null;
		try {
			data = userMapper.getConcernTagList(request.getUserId());
		}
		catch (Exception e) {
			logger.error("getConcernTagList dao error", e);
			throw new DaoException(DubboReturnCode.ALERT_ERR, e.getMessage());
		}

		DubboConcernTagListResponse response = BeanMapper.map(request, DubboConcernTagListResponse.class);
		response.setCode(DubboReturnCode.SUCCESS);
		response.setData(data);
		return response;
	}

}
