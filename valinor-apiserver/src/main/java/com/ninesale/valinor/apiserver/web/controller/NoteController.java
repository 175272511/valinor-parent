package com.ninesale.valinor.apiserver.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.model.CommonNoteInfo;
import com.ninesale.valinor.apiserver.service.CommonNoteService;
import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.common.constant.ReturnCode;
import com.ninesale.valinor.apiserver.web.model.common.ClientReplyUser;
import com.ninesale.valinor.apiserver.web.model.note.ClientAddCommentRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientAddCommentResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientAddNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientAddNoteResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientBaseNoteInfo;
import com.ninesale.valinor.apiserver.web.model.note.ClientCollectNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientCommentInfo;
import com.ninesale.valinor.apiserver.web.model.note.ClientDelCollectNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientDelCommentRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientDelNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientGetCommentListRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientGetCommentListResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientGetMyNoteListNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientGetMyNoteListNoteResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientNoteImgInfo;
import com.ninesale.valinor.apiserver.web.model.note.ClientPublicNoteInfo;
import com.ninesale.valinor.apiserver.web.model.note.ClientQueryNoteByNoteIdRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientQueryNoteByNoteIdResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientQueryPublicNoteListNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientQueryPublicNoteListNoteResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientShareNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientUpdateNoteRequest;
import com.ninesale.valinor.apiserver.web.model.note.ClientUpdateNoteResponse;
import com.ninesale.valinor.apiserver.web.model.user.ClientPraiseRequest;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.auth.api.model.request.DubboUserListRequest;
import com.ninesale.valinor.auth.api.model.response.DubboUserListResponse;
import com.ninesale.valinor.auth.api.service.DubboAuthService;
import com.ninesale.valinor.comment.api.model.DubboAddCommentRequest;
import com.ninesale.valinor.comment.api.model.DubboAddCommentResponse;
import com.ninesale.valinor.comment.api.model.DubboCollectNoteRequest;
import com.ninesale.valinor.comment.api.model.DubboCommentInfo;
import com.ninesale.valinor.comment.api.model.DubboDelCollectNoteRequest;
import com.ninesale.valinor.comment.api.model.DubboDelCommentRequest;
import com.ninesale.valinor.comment.api.model.DubboGetCommentListRequest;
import com.ninesale.valinor.comment.api.model.DubboGetCommentListResponse;
import com.ninesale.valinor.comment.api.model.DubboPraiseRequest;
import com.ninesale.valinor.comment.api.model.DubboShareNoteRequest;
import com.ninesale.valinor.comment.api.service.DubboCommentService;
import com.ninesale.valinor.image.api.constant.DubboImageConstants;
import com.ninesale.valinor.image.api.model.dto.DubboImg;
import com.ninesale.valinor.image.api.model.dto.DubboImgResInfo;
import com.ninesale.valinor.image.api.model.request.DubboInsertUpdateImgRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTagRequest;
import com.ninesale.valinor.image.api.model.response.DubboInsertUpdateImgResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTagResponse;
import com.ninesale.valinor.image.api.service.DubboImgService;
import com.ninesale.valinor.note.api.model.request.note.DubboAddNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboDelNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboGetMyNoteListNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboQueryNoteByNoteIdRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboQueryPublicNoteListNoteRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboUpdateNoteRequest;
import com.ninesale.valinor.note.api.model.response.note.DubboAddNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboGetMyNoteListNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboQueryNoteByNoteIdResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboQueryPublicNoteListNoteResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboUpdateNoteResponse;
import com.ninesale.valinor.note.api.service.DubboNoteService;
import com.ninesale.valinor.userinfo.api.service.DubboUserService;
import com.pubpi.common.exception.ControllerException;
import com.pubpi.common.exception.ServiceException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.Collections3;
import com.pubpi.common.utils.StringUtils;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("/note")
public class NoteController extends BaseController {

	@Resource
	private DubboNoteService dubboNoteService;

	@Resource
	private DubboCommentService dubboCommentService;

	@Resource
	private DubboImgService dubboImgService;

	@Resource
	private DubboUserService dubboUserService;

	@Resource
	private DubboAuthService dubboAuthService;

	@Resource
	private CommonNoteService commonNoteService;

	/**
	 * 用户添加笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addnote", method = RequestMethod.POST)
	public ClientBasicResponse addNote(@RequestBody ClientAddNoteRequest req) {

		/**
		 * 添加图片信息
		 */
		DubboInsertUpdateImgRequest dubboInsertUpdateImgRequest = BeanMapper.map(req, DubboInsertUpdateImgRequest.class);
		List<DubboImg> imgList = dubboInsertUpdateImgRequest.getImgList();
		for (DubboImg temp : imgList) {
			temp.setTypeId(DubboImageConstants.NOTE_IMG);
		}

		DubboInsertUpdateImgResponse dubboinsertUpdateImgAndTagResponse = dubboImgService.insertUpdateImgAndTag(dubboInsertUpdateImgRequest);

		if (dubboinsertUpdateImgAndTagResponse.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboinsertUpdateImgAndTagResponse.getCode(), dubboinsertUpdateImgAndTagResponse.getDesc());
		}

		Map<String, Long> fileId2IdMap = transferList2Map(dubboinsertUpdateImgAndTagResponse.getAddImgReslist());

		List<Long> imgIdList = new ArrayList<Long>();

		for (DubboImg temp : imgList) {
			Long imgId = fileId2IdMap.get(temp.getFileId());
			if (null != imgId) {
				imgIdList.add(imgId);
			}
		}

		DubboQueryImgTagRequest dubboQueryImgTagRequest = new DubboQueryImgTagRequest();

		dubboQueryImgTagRequest.setImgIdList(imgIdList);

		DubboAddNoteRequest dubboAddNoteRequest = BeanMapper.map(req, DubboAddNoteRequest.class);
		dubboAddNoteRequest.setUserId(getCurrentUser().getId());
		dubboAddNoteRequest.setImgIdList(imgIdList);
		DubboAddNoteResponse dubboAddNoteResponse = dubboNoteService.addNote(dubboAddNoteRequest);

		ClientAddNoteResponse resp = BeanMapper.map(dubboAddNoteResponse, ClientAddNoteResponse.class);

		// 补全图片信息
		DubboQueryImgTagResponse dubboQueryImgTagResponse = dubboImgService.queryImgList(dubboQueryImgTagRequest);

		List<ClientNoteImgInfo> clientImgList = BeanMapper.map(dubboQueryImgTagResponse.getImgList(), ClientNoteImgInfo.class);
		resp.getNoteInfo().setImgList(clientImgList);

		return resp;
	}

	/**
	 * @param addImgReslist
	 * @return
	 */
	private Map<String, Long> transferList2Map(List<DubboImgResInfo> addImgReslist) {
		Map<String, Long> res = new HashMap<String, Long>();
		for (DubboImgResInfo temp : addImgReslist) {
			res.put(temp.getFileId(), temp.getImgId());
		}
		return res;
	}

	/**
	 * 更新笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updatenote", method = RequestMethod.POST)
	public ClientBasicResponse updateNote(@RequestBody ClientUpdateNoteRequest req) {

		/**
		 * 添加图片信息
		 */
		DubboInsertUpdateImgRequest dubboInsertUpdateImgRequest = BeanMapper.map(req, DubboInsertUpdateImgRequest.class);
		List<DubboImg> imgList = dubboInsertUpdateImgRequest.getImgList();
		for (DubboImg temp : imgList) {
			temp.setTypeId(DubboImageConstants.NOTE_IMG);
		}

		DubboInsertUpdateImgResponse dubboinsertUpdateImgAndTagResponse = dubboImgService.insertUpdateImgAndTag(dubboInsertUpdateImgRequest);

		if (dubboinsertUpdateImgAndTagResponse.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboinsertUpdateImgAndTagResponse.getCode(), dubboinsertUpdateImgAndTagResponse.getDesc());
		}

		Map<String, Long> fileId2IdMap = transferList2Map(dubboinsertUpdateImgAndTagResponse.getAddImgReslist());

		List<Long> imgIdList = new ArrayList<Long>();

		for (DubboImg temp : imgList) {
			Long imgId = fileId2IdMap.get(temp.getFileId());
			if (null != imgId) {
				imgIdList.add(imgId);
			}
		}

		DubboUpdateNoteRequest dubboUpdateNoteRequest = BeanMapper.map(req, DubboUpdateNoteRequest.class);

		dubboUpdateNoteRequest.setImgIdList(imgIdList);
		DubboUpdateNoteResponse dubboUpdateNoteResponse = dubboNoteService.updateNote(dubboUpdateNoteRequest);

		ClientUpdateNoteResponse resp = BeanMapper.map(dubboUpdateNoteResponse, ClientUpdateNoteResponse.class);

		DubboQueryImgTagRequest dubboQueryImgTagRequest = new DubboQueryImgTagRequest();

		dubboQueryImgTagRequest.setImgIdList(imgIdList);
		// 补全图片信息
		DubboQueryImgTagResponse dubboQueryImgTagResponse = dubboImgService.queryImgList(dubboQueryImgTagRequest);

		List<ClientNoteImgInfo> clientImgList = BeanMapper.map(dubboQueryImgTagResponse.getImgList(), ClientNoteImgInfo.class);
		resp.getNoteInfo().setImgList(clientImgList);

		return resp;
	}

	/**
	 * 用户查询自己发布的笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getmynotelist", method = RequestMethod.POST)
	public ClientBasicResponse getMyNoteList(@RequestBody ClientGetMyNoteListNoteRequest req) {

		DubboGetMyNoteListNoteRequest dubboReq = BeanMapper.map(req, DubboGetMyNoteListNoteRequest.class);
		DubboGetMyNoteListNoteResponse dubboResp = dubboNoteService.getMyNoteList(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			throw new ServiceException(dubboResp.getCode(), dubboResp.getDesc());
		}

		List<CommonNoteInfo> commonNoteInfoList = BeanMapper.map(dubboResp.getNoteList(), CommonNoteInfo.class);
		commonNoteService.fillImgInfo(commonNoteInfoList);
		commonNoteService.fillCommentNumInfo(commonNoteInfoList);

		ClientGetMyNoteListNoteResponse resp = new ClientGetMyNoteListNoteResponse();
		resp.setNoteList(BeanMapper.map(commonNoteInfoList, ClientBaseNoteInfo.class));
		return resp;
	}

	/**
	 * 删除笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "delnote", method = RequestMethod.POST)
	public ClientBasicResponse delNote(@RequestBody ClientDelNoteRequest req) {
		DubboDelNoteRequest dubboReq = BeanMapper.map(req, DubboDelNoteRequest.class);

		DubboBasicResponse dubboResp = dubboNoteService.delNote(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		return new ClientBasicResponse();
	}

	/**
	 * 查询公开笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querypublicnote", method = RequestMethod.POST)
	public ClientBasicResponse queryPublicNote(@RequestBody ClientQueryPublicNoteListNoteRequest req) {

		DubboQueryPublicNoteListNoteRequest dubboReq = BeanMapper.map(req, DubboQueryPublicNoteListNoteRequest.class);
		DubboQueryPublicNoteListNoteResponse dubboResp = dubboNoteService.queryPublicNote(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			throw new ServiceException(dubboResp.getCode(), dubboResp.getDesc());
		}

		List<CommonNoteInfo> commonNoteInfoList = BeanMapper.map(dubboResp.getNoteList(), CommonNoteInfo.class);
		commonNoteService.fillImgInfo(commonNoteInfoList);
		commonNoteService.fillUserInfo(commonNoteInfoList);
		commonNoteService.fillCommentNumInfo(commonNoteInfoList);
		commonNoteService.fillCommentFlag(commonNoteInfoList);

		ClientQueryPublicNoteListNoteResponse resp = new ClientQueryPublicNoteListNoteResponse();

		resp.setCurrentPage(dubboResp.getCurrentPage());
		resp.setPageSize(dubboResp.getPageSize());
		resp.setTotalNum(dubboResp.getTotalNum());
		resp.setNoteList(BeanMapper.map(commonNoteInfoList, ClientPublicNoteInfo.class));
		return resp;
	}

	/**
	 * 查询公开笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "querynotebyid", method = RequestMethod.POST)
	public ClientBasicResponse queryNoteById(@RequestBody ClientQueryNoteByNoteIdRequest req) {

		DubboQueryNoteByNoteIdRequest dubboReq = BeanMapper.map(req, DubboQueryNoteByNoteIdRequest.class);
		DubboQueryNoteByNoteIdResponse dubboResp = dubboNoteService.queryNoteById(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			throw new ServiceException(dubboResp.getCode(), dubboResp.getDesc());
		}

		CommonNoteInfo commonNoteInfo = BeanMapper.map(dubboResp.getNoteInfo(), CommonNoteInfo.class);
		commonNoteService.fillImgInfo(commonNoteInfo);
		commonNoteService.fillUserInfo(commonNoteInfo);
		commonNoteService.fillCommentNumInfo(commonNoteInfo);
		commonNoteService.fillCommentFlag(commonNoteInfo);

		ClientQueryNoteByNoteIdResponse resp = new ClientQueryNoteByNoteIdResponse();
		resp.setNoteInfo(BeanMapper.map(commonNoteInfo, ClientPublicNoteInfo.class));
		return resp;
	}

	/**
	 * 获取笔记的评论信息
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getcommentlist", method = RequestMethod.POST)
	public ClientBasicResponse getCommentList(@RequestBody ClientGetCommentListRequest req) {
		DubboGetCommentListRequest dubboReq = BeanMapper.map(req, DubboGetCommentListRequest.class);

		DubboGetCommentListResponse dubboResp = dubboCommentService.getCommentList(dubboReq);
		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		List<Long> userIdList = new ArrayList<Long>();
		for (DubboCommentInfo temp : dubboResp.getCommentList()) {
			userIdList.add(temp.getUserId());

			List<Long> replyUserIdList = temp.getReplyUserIdList();

			if (!Collections3.isEmpty(replyUserIdList)) {
				userIdList.addAll(replyUserIdList);
			}
		}
		List<User> userList = getUserListById(userIdList);
		List<DubboCommentInfo> dubboCommentList = dubboResp.getCommentList();

		List<ClientCommentInfo> clientCommentList = fillCommentUserInfo(userList, dubboCommentList);

		ClientGetCommentListResponse resp = new ClientGetCommentListResponse();
		resp.setCurrentPage(dubboResp.getCurrentPage());
		resp.setPageSize(dubboResp.getPageSize());
		resp.setTotalNum(dubboResp.getTotalNum());
		resp.setCommentList(clientCommentList);
		return resp;
	}

	private List<ClientCommentInfo> fillCommentUserInfo(List<User> userList, List<DubboCommentInfo> dubboCommentList) {
		Map<Long, User> userMap = transferUserListToMap(userList);
		List<ClientCommentInfo> clientCommentList = BeanMapper.map(dubboCommentList, ClientCommentInfo.class);

		int size = dubboCommentList.size();
		for (int i = 0; i < size; i++) {
			ClientCommentInfo temp = clientCommentList.get(i);
			User user = userMap.get(temp.getUserId());
			if (StringUtils.isNull(user.getNickname())) {
				temp.setUsername(user.getUsername());
			}
			else {
				temp.setUsername(user.getNickname());
			}
			temp.setUserImg(user.getUserImg());

			DubboCommentInfo dubboCommentInfo = dubboCommentList.get(i);

			List<ClientReplyUser> tempList = new ArrayList<ClientReplyUser>();

			List<Long> replyUserIdList = dubboCommentInfo.getReplyUserIdList();
			if (!Collections3.isEmpty(replyUserIdList)) {
				for (Long tempId : replyUserIdList) {
					User replsyUser = userMap.get(tempId);
					if (null != replsyUser) {
						tempList.add(BeanMapper.map(replsyUser, ClientReplyUser.class));
					}
				}
				temp.setReplyUserList(tempList);
			}
		}
		return clientCommentList;
	}

	private Map<Long, User> transferUserListToMap(List<User> userList) {
		Map<Long, User> userMap = new HashMap<Long, User>();
		for (User temp : userList) {
			userMap.put(temp.getId(), temp);
		}
		return userMap;
	}

	/**
	 * 评论笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addcomment", method = RequestMethod.POST)
	public ClientBasicResponse addComment(@RequestBody ClientAddCommentRequest req) {
		DubboAddCommentRequest dubboReq = BeanMapper.map(req, DubboAddCommentRequest.class);

		User currentUser = getCurrentUser();
		dubboReq.setUserId(currentUser.getId());

		DubboAddCommentResponse dubboResp = dubboCommentService.addComment(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		ClientAddCommentResponse resp = BeanMapper.map(dubboResp, ClientAddCommentResponse.class);

		List<User> userList = getUserListById(dubboResp.getCommentInfo().getReplyUserIdList());
		List<ClientReplyUser> clientReplyUserList = BeanMapper.map(userList, ClientReplyUser.class);
		resp.getCommentInfo().setReplyUserList(clientReplyUserList);

		return resp;
	}

	private List<User> getUserListById(List<Long> userIdList) {

		if (Collections3.isEmpty(userIdList)) {
			return new ArrayList<User>();
		}

		DubboUserListRequest getUserListReq = new DubboUserListRequest();
		getUserListReq.setUserIdList(userIdList);
		DubboUserListResponse userListResp = dubboAuthService.getUserListById(getUserListReq);

		if (userListResp.getCode() != ReturnCode.SUCCESS) {
			throw new ControllerException(userListResp.getCode(), userListResp.getDesc());
		}
		return userListResp.getData();
	}

	/**
	 * 删除评论
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "delcomment", method = RequestMethod.POST)
	public ClientBasicResponse delComment(@RequestBody ClientDelCommentRequest req) {

		DubboDelCommentRequest dubboReq = BeanMapper.map(req, DubboDelCommentRequest.class);

		DubboBasicResponse dubboResp = dubboCommentService.delComment(dubboReq);
		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		return new ClientBasicResponse();
	}

	/**
	 * 收藏笔记
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "collectnote", method = RequestMethod.POST)
	public ClientBasicResponse collectNote(@RequestBody ClientCollectNoteRequest req) {

		DubboCollectNoteRequest dubboReq = BeanMapper.map(req, DubboCollectNoteRequest.class);
		User currentUser = getCurrentUser();
		dubboReq.setUserId(currentUser.getId());

		DubboBasicResponse dubboResp = dubboCommentService.collectNote(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		return new ClientBasicResponse();
	}

	/**
	 * 删除收藏
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "delcollectnote", method = RequestMethod.POST)
	public ClientBasicResponse delCollectNote(@RequestBody ClientDelCollectNoteRequest req) {
		DubboDelCollectNoteRequest dubboReq = BeanMapper.map(req, DubboDelCollectNoteRequest.class);
		DubboBasicResponse dubboResp = dubboCommentService.delCollectNote(dubboReq);
		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}
		return new ClientBasicResponse();
	}

	@RequestMapping(value = "sharenote", method = RequestMethod.POST)
	public ClientBasicResponse shareNote(@RequestBody ClientShareNoteRequest req) {

		DubboShareNoteRequest dubboReq = BeanMapper.map(req, DubboShareNoteRequest.class);
		User currentUser = getCurrentUser();
		dubboReq.setUserId(currentUser.getId());

		DubboBasicResponse dubboResp = dubboCommentService.shareNote(dubboReq);

		if (dubboResp.getCode() != ReturnCode.SUCCESS) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		return new ClientBasicResponse();
	}

	/**
	 * 点赞
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "praise", method = RequestMethod.POST)
	public ClientBasicResponse praise(@RequestBody ClientPraiseRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboPraiseRequest request = BeanMapper.map(req, DubboPraiseRequest.class);
		request.setUserId(user.getId());

		try {
			dubboResponse = dubboCommentService.praise(request);
		}
		catch (Exception e) {
			logger.error("praise service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "点赞失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

	/**
	 * 取消点赞
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "cancelpraise", method = RequestMethod.POST)
	public ClientBasicResponse cancelPraise(@RequestBody ClientPraiseRequest req) {
		User user = getCurrentUser();

		DubboBasicResponse dubboResponse = null;
		DubboPraiseRequest request = new DubboPraiseRequest();
		request.setTid(req.getTid());
		request.setUserId(user.getId());
		request.setNoteId(req.getNoteId());
		try {
			dubboResponse = dubboCommentService.cancelPraise(request);
		}
		catch (Exception e) {
			logger.error("cancelPraise service error", e);
			return new ClientBasicResponse(ReturnCode.ALERT_ERR, "取消点赞失败");
		}

		if (ReturnCode.SUCCESS != dubboResponse.getCode()) {
			return new ClientBasicResponse(dubboResponse.getCode(), dubboResponse.getDesc());
		}

		return new ClientBasicResponse(ReturnCode.SUCCESS, "success");
	}

}
