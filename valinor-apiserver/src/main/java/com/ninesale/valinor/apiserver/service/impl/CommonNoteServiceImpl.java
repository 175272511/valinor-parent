package com.ninesale.valinor.apiserver.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import com.ninesale.valinor.apiserver.common.constant.ExceptionCode;
import com.ninesale.valinor.apiserver.model.CommonNoteImgInfo;
import com.ninesale.valinor.apiserver.model.CommonNoteInfo;
import com.ninesale.valinor.apiserver.service.CommonNoteService;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.request.DubboUserListRequest;
import com.ninesale.valinor.auth.api.model.response.DubboUserListResponse;
import com.ninesale.valinor.auth.api.service.DubboAuthService;
import com.ninesale.valinor.comment.api.model.DubboCollectInfo;
import com.ninesale.valinor.comment.api.model.DubboGetCommentNumInfoRequest;
import com.ninesale.valinor.comment.api.model.DubboGetCommentNumInfoResponse;
import com.ninesale.valinor.comment.api.model.DubboGetPraiseAndCollectRequest;
import com.ninesale.valinor.comment.api.model.DubboGetPraiseAndCollectResponse;
import com.ninesale.valinor.comment.api.model.DubboNoteStatisticsInfo;
import com.ninesale.valinor.comment.api.model.DubboPraiseInfo;
import com.ninesale.valinor.comment.api.service.DubboCommentService;
import com.ninesale.valinor.image.api.model.dto.DubboImgRespInfo;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTagRequest;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTagResponse;
import com.ninesale.valinor.image.api.service.DubboImgService;
import com.ninesale.valinor.note.api.model.request.note.DubboGetNoteByIdListRequest;
import com.ninesale.valinor.note.api.model.response.note.DubboGetNoteByIdListResponse;
import com.ninesale.valinor.note.api.service.DubboNoteService;
import com.pubpi.common.exception.ControllerException;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.Collections3;
import com.pubpi.valinor.dubbo.base.model.DubboReturnCode;

/**
 * 
 * @author skyhawk
 *
 */
@Service
public class CommonNoteServiceImpl implements CommonNoteService {

	@Resource
	private DubboNoteService dubboNoteService;

	@Resource
	private DubboImgService dubboImgService;

	@Resource
	private DubboAuthService dubboAuthService;

	@Resource
	private DubboCommentService dubboCommentService;

	/**
	 * 根据笔记id列表获取笔记信息
	 */
	@Override
	public List<CommonNoteInfo> getNoteByIdList(List<Long> noteIdList) {

		DubboGetNoteByIdListRequest getNoteListReq = new DubboGetNoteByIdListRequest();
		getNoteListReq.setNoteIdList(noteIdList);

		DubboGetNoteByIdListResponse dubboResp = dubboNoteService.queryNoteByIdList(getNoteListReq);
		if (dubboResp.getCode() != DubboReturnCode.SUCCESS) {
			throw new ServiceException(dubboResp.getCode(), dubboResp.getDesc());
		}

		return BeanMapper.map(dubboResp.getNoteList(), CommonNoteInfo.class);
	}

	/**
	 * 填充图片信息
	 */
	@Override
	public void fillImgInfo(List<CommonNoteInfo> noteList) {

		if (Collections3.isEmpty(noteList)) {
			return;
		}

		List<Long> imgIdList = new ArrayList<Long>();

		for (CommonNoteInfo temp : noteList) {
			imgIdList.addAll(temp.getImgIdList());
		}

		DubboQueryImgTagRequest dubboQueryImgTagRequest = new DubboQueryImgTagRequest();

		dubboQueryImgTagRequest.setImgIdList(imgIdList);
		// 补全图片信息
		DubboQueryImgTagResponse dubboQueryImgTagResponse = dubboImgService.queryImgList(dubboQueryImgTagRequest);

		if (dubboQueryImgTagResponse.getCode() != ReturnCode.SUCCESS) {
			throw new ServiceException(dubboQueryImgTagResponse.getCode(), dubboQueryImgTagResponse.getDesc());
		}

		Map<Long, DubboImgRespInfo> imgInfoMap = transfer2Map(dubboQueryImgTagResponse.getImgList());

		for (CommonNoteInfo temp : noteList) {
			List<Long> imgIdList2 = temp.getImgIdList();
			List<CommonNoteImgInfo> tempList = new ArrayList<CommonNoteImgInfo>();
			for (Long tempLong : imgIdList2) {
				tempList.add(BeanMapper.map(imgInfoMap.get(tempLong), CommonNoteImgInfo.class));
			}
			temp.setImgList(tempList);
		}
	}

	/**
	 * 填充用户信息
	 */
	@Override
	public void fillUserInfo(List<CommonNoteInfo> noteList) {

		if (Collections3.isEmpty(noteList)) {
			return;
		}

		DubboUserListRequest getUserInfoRequest = new DubboUserListRequest();

		List<Long> userIdList = new ArrayList<Long>();

		for (CommonNoteInfo temp : noteList) {
			userIdList.add(temp.getUserId());
		}
		getUserInfoRequest.setUserIdList(userIdList);

		DubboUserListResponse userListResp = dubboAuthService.getUserListById(getUserInfoRequest);
		if (userListResp.getCode() != ReturnCode.SUCCESS) {
			throw new ServiceException(userListResp.getCode(), userListResp.getDesc());
		}

		List<User> userList = userListResp.getData();

		Map<Long, User> userMap = transferUserListToMap(userList);

		for (CommonNoteInfo temp : noteList) {
			User user = userMap.get(temp.getUserId());
			temp.setUserName(user.getUsername());
			temp.setUserImg(user.getUserImg());
		}
	}

	/**
	 * 填充评论数据信息
	 */
	@Override
	public void fillCommentNumInfo(List<CommonNoteInfo> noteList) {

		if (Collections3.isEmpty(noteList)) {
			return;
		}
		DubboGetCommentNumInfoRequest dubboReq = new DubboGetCommentNumInfoRequest();
		List<Long> noteIdList = new ArrayList<Long>();

		for (CommonNoteInfo temp : noteList) {
			noteIdList.add(temp.getNoteId());
		}

		dubboReq.setNoteIdList(noteIdList);

		DubboGetCommentNumInfoResponse dubboResp = dubboCommentService.getCommentNumInfo(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			throw new ServiceException(dubboResp.getCode(), dubboResp.getDesc());
		}

		List<DubboNoteStatisticsInfo> noteStatisticsInfoList = dubboResp.getNoteStatisticsInfoList();

		Map<Long, DubboNoteStatisticsInfo> tempMap = transferList2Map(noteStatisticsInfoList);

		for (CommonNoteInfo temp : noteList) {
			DubboNoteStatisticsInfo tempStatisticInfo = tempMap.get(temp.getNoteId());
			if (null != tempStatisticInfo) {
				temp.setCollectNum(tempStatisticInfo.getCollectNum());
				temp.setCommentNum(tempStatisticInfo.getCommentNum());
				temp.setViewNum(tempStatisticInfo.getViewNum());
				temp.setShareNum(tempStatisticInfo.getShareNum());
				temp.setPraiseNum(tempStatisticInfo.getPraiseNum());
			}
			else {
				temp.setCollectNum(0);
				temp.setCommentNum(0);
				temp.setViewNum(0);
				temp.setShareNum(0);
				temp.setPraiseNum(0);
			}
		}
	}

	/**
	 * @param noteStatisticsInfoList
	 * @return
	 */
	private Map<Long, DubboNoteStatisticsInfo> transferList2Map(List<DubboNoteStatisticsInfo> noteStatisticsInfoList) {
		Map<Long, DubboNoteStatisticsInfo> resultMap = new HashMap<Long, DubboNoteStatisticsInfo>();

		for (DubboNoteStatisticsInfo temp : noteStatisticsInfoList) {
			resultMap.put(temp.getNoteId(), temp);
		}

		return resultMap;
	}

	/**
	 * @param imgList
	 * @return
	 */
	private Map<Long, DubboImgRespInfo> transfer2Map(List<DubboImgRespInfo> imgList) {
		Map<Long, DubboImgRespInfo> imgInfoMap = new HashMap<Long, DubboImgRespInfo>();

		for (DubboImgRespInfo temp : imgList) {
			imgInfoMap.put(temp.getImgId(), temp);
		}

		return imgInfoMap;
	}

	private Map<Long, User> transferUserListToMap(List<User> userList) {
		Map<Long, User> userMap = new HashMap<Long, User>();
		for (User temp : userList) {
			userMap.put(temp.getId(), temp);
		}
		return userMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.apiserver.service.CommonNoteService#fillImgInfo(com.
	 * ninesale.valinor.apiserver.model.CommonNoteInfo)
	 */
	@Override
	public void fillImgInfo(CommonNoteInfo commonNoteInfo) {
		if (null == commonNoteInfo) {
			return;
		}

		List<CommonNoteInfo> commonNoteInfoList = new ArrayList<CommonNoteInfo>();
		commonNoteInfoList.add(commonNoteInfo);
		fillImgInfo(commonNoteInfoList);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.apiserver.service.CommonNoteService#fillUserInfo(com
	 * .ninesale.valinor.apiserver.model.CommonNoteInfo)
	 */
	@Override
	public void fillUserInfo(CommonNoteInfo commonNoteInfo) {
		if (null == commonNoteInfo) {
			return;
		}

		List<CommonNoteInfo> commonNoteInfoList = new ArrayList<CommonNoteInfo>();
		commonNoteInfoList.add(commonNoteInfo);
		fillUserInfo(commonNoteInfoList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.apiserver.service.CommonNoteService#
	 * fillCommentNumInfo(com.ninesale.valinor.apiserver.model.CommonNoteInfo)
	 */
	@Override
	public void fillCommentNumInfo(CommonNoteInfo commonNoteInfo) {
		if (null == commonNoteInfo) {
			return;
		}
		List<CommonNoteInfo> commonNoteInfoList = new ArrayList<CommonNoteInfo>();
		commonNoteInfoList.add(commonNoteInfo);
		fillCommentNumInfo(commonNoteInfoList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.apiserver.service.CommonNoteService#fillCommentFlag(
	 * com.ninesale.valinor.apiserver.model.CommonNoteInfo, java.lang.Long)
	 */
	@Override
	public void fillCommentFlag(List<CommonNoteInfo> noteList) {

		if (Collections3.isEmpty(noteList)) {
			return;
		}

		DubboGetPraiseAndCollectRequest dubboReq = new DubboGetPraiseAndCollectRequest();

		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		User currentUser = null;
		if (null != session) {
			currentUser = (User) session.getAttribute("userInfo");

		}
		if (null == currentUser) {
			return;
		}
		dubboReq.setUserId(currentUser.getId());

		DubboGetPraiseAndCollectResponse dubboResp = dubboCommentService.getPraiseAndCollectList(dubboReq);
		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			throw new ServiceException(dubboResp.getCode(), dubboResp.getDesc());
		}

		List<DubboPraiseInfo> praiseInfoList = dubboResp.getPraiseInfoList();
		Set<Long> praiseNoteSet = new HashSet<Long>();
		if (!Collections3.isEmpty(praiseInfoList)) {
			for (DubboPraiseInfo temp : praiseInfoList) {
				praiseNoteSet.add(temp.getNoteId());
			}
		}
		List<DubboCollectInfo> collectInfoList = dubboResp.getCollectInfoList();

		Set<Long> collectNoteSet = new HashSet<Long>();
		if (!Collections3.isEmpty(collectInfoList)) {
			for (DubboCollectInfo temp : collectInfoList) {
				collectNoteSet.add(temp.getNoteId());
			}
		}

		for (CommonNoteInfo temp : noteList) {
			if (praiseNoteSet.contains(temp.getNoteId())) {
				temp.setPraiseFlag(1);
			}
			if (collectNoteSet.contains(temp.getNoteId())) {
				temp.setCollectFlag(1);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.apiserver.service.CommonNoteService#fillCommentFlag(
	 * com.ninesale.valinor.apiserver.model.CommonNoteInfo, java.lang.Long)
	 */
	@Override
	public void fillCommentFlag(CommonNoteInfo commonNoteInfo) {
		if (null == commonNoteInfo) {
			return;
		}
		List<CommonNoteInfo> commonNoteInfoList = new ArrayList<CommonNoteInfo>();
		commonNoteInfoList.add(commonNoteInfo);
		fillCommentFlag(commonNoteInfoList);
	}
}
