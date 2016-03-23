package com.ninesale.valinor.apiserver.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ninesale.valinor.apiserver.model.CommonNoteInfo;
import com.ninesale.valinor.apiserver.service.CommonNoteService;
import com.ninesale.valinor.apiserver.web.common.ClientBasicResponse;
import com.ninesale.valinor.apiserver.web.model.album.ClientAddAlbumRequest;
import com.ninesale.valinor.apiserver.web.model.album.ClientAddAlbumResponse;
import com.ninesale.valinor.apiserver.web.model.album.ClientAlbumInfo;
import com.ninesale.valinor.apiserver.web.model.album.ClientDelAlbumRequest;
import com.ninesale.valinor.apiserver.web.model.album.ClientGetAlbumContentRequest;
import com.ninesale.valinor.apiserver.web.model.album.ClientGetAlbumContentResponse;
import com.ninesale.valinor.apiserver.web.model.album.ClientGetAlbumListRequest;
import com.ninesale.valinor.apiserver.web.model.album.ClientGetAlbumListResponse;
import com.ninesale.valinor.apiserver.web.model.album.ClientUpdateAlbumRequest;
import com.ninesale.valinor.apiserver.web.model.album.ClientUpdateAlbumResponse;
import com.ninesale.valinor.apiserver.web.model.note.ClientPublicNoteInfo;
import com.ninesale.valinor.auth.api.model.User;
import com.ninesale.valinor.comment.api.model.DubboGetAlbumContentRequest;
import com.ninesale.valinor.comment.api.model.DubboGetAlbumContentResponse;
import com.ninesale.valinor.comment.api.service.DubboCommentService;
import com.ninesale.valinor.note.api.model.request.album.DubboAddAlbumRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboDelAlbumRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboGetAlbumListRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboUpdateAlbumRequest;
import com.ninesale.valinor.note.api.model.request.note.DubboGetNoteByIdListRequest;
import com.ninesale.valinor.note.api.model.response.album.DubboAddAlbumResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboGetAlbumListResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboUpdateAlbumResponse;
import com.ninesale.valinor.note.api.model.response.note.DubboGetNoteByIdListResponse;
import com.ninesale.valinor.note.api.service.DubboAlbumService;
import com.ninesale.valinor.note.api.service.DubboNoteService;
import com.pubpi.common.exception.ControllerException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.Collections3;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;
import com.pubpi.valinor.dubbo.base.model.DubboReturnCode;

/**
 * 
 * @author hawk
 *
 */
@RestController
@RequestMapping("/album")
public class AlbumController extends BaseController {

	@Resource
	private DubboAlbumService dubboAlbumService;

	@Resource
	private DubboNoteService dubboNoteService;

	@Resource
	private DubboCommentService dubboCommentService;

	@Resource
	private CommonNoteService commonNoteService;

	/**
	 * 添加专辑
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "addalbum", method = RequestMethod.POST)
	public ClientBasicResponse addAlbum(@RequestBody ClientAddAlbumRequest req) {
		DubboAddAlbumRequest dubboReq = BeanMapper.map(req, DubboAddAlbumRequest.class);

		User currentUser = getCurrentUser();

		dubboReq.setUserId(currentUser.getId());

		DubboAddAlbumResponse dubboResp = dubboAlbumService.addAlbum(dubboReq);

		if (DubboReturnCode.SUCCESS != dubboResp.getCode()) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		ClientAddAlbumResponse resp = BeanMapper.map(dubboResp, ClientAddAlbumResponse.class);

		return resp;
	}

	/**
	 * 更新专辑
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "updatealbum", method = RequestMethod.POST)
	public ClientBasicResponse updateAlbum(@RequestBody ClientUpdateAlbumRequest req) {

		DubboUpdateAlbumRequest dubboReq = BeanMapper.map(req, DubboUpdateAlbumRequest.class);

		DubboUpdateAlbumResponse dubboResp = dubboAlbumService.updateAlbum(dubboReq);

		if (DubboReturnCode.SUCCESS != dubboResp.getCode()) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		ClientUpdateAlbumResponse resp = BeanMapper.map(dubboResp, ClientUpdateAlbumResponse.class);

		return resp;
	}

	/**
	 * 获取专辑列表
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getalbumlist", method = RequestMethod.POST)
	public ClientBasicResponse getAlbumList(@RequestBody ClientGetAlbumListRequest req) {

		DubboGetAlbumListRequest dubboReq = BeanMapper.map(req, DubboGetAlbumListRequest.class);

		User currentUser = getCurrentUser();
		dubboReq.setUserId(currentUser.getId());

		DubboGetAlbumListResponse dubboResp = dubboAlbumService.getAlbumList(dubboReq);

		if (DubboReturnCode.SUCCESS != dubboResp.getCode()) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		ClientGetAlbumListResponse resp = BeanMapper.map(dubboResp, ClientGetAlbumListResponse.class);

		List<ClientAlbumInfo> privateAlbumList = resp.getPrivateAlbumList();
		List<ClientAlbumInfo> publicAlbumList = resp.getPublicAlbumList();

		if (!Collections3.isEmpty(privateAlbumList)) {
			for (ClientAlbumInfo temp : privateAlbumList) {
				fillNoteInfo(temp);
			}
		}
		else {
			DubboAddAlbumRequest addAlbumReq = new DubboAddAlbumRequest();
			addAlbumReq.setAlbumName("我的私有专辑");
			addAlbumReq.setAlbumStatus(1);
			addAlbumReq.setUserId(currentUser.getId());
			DubboAddAlbumResponse addAlbumResponse = dubboAlbumService.addAlbum(addAlbumReq);

			if (DubboReturnCode.SUCCESS != addAlbumResponse.getCode()) {
				return new ClientBasicResponse(addAlbumResponse.getCode(), addAlbumResponse.getDesc());
			}

			privateAlbumList = new ArrayList<ClientAlbumInfo>();

			ClientAlbumInfo temp = BeanMapper.map(addAlbumResponse.getAlbumInfo(), ClientAlbumInfo.class);
			fillNoteInfo(temp);
			privateAlbumList.add(temp);			
			resp.setPrivateAlbumList(privateAlbumList);
		}

		if (!Collections3.isEmpty(publicAlbumList)) {
			for (ClientAlbumInfo temp : publicAlbumList) {
				fillNoteInfo(temp);
			}
		}

		return resp;
	}

	/**
	 * @param temp
	 */
	private void fillNoteInfo(ClientAlbumInfo temp) {
		DubboGetAlbumContentRequest dubboReq = new DubboGetAlbumContentRequest();
		dubboReq.setAlbumId(temp.getAlbumId());
		DubboGetAlbumContentResponse dubboResp = dubboCommentService.getAlbumContent(dubboReq);

		if (DubboReturnCode.SUCCESS != dubboResp.getCode()) {
			throw new ControllerException(dubboResp.getCode(), dubboResp.getDesc());
		}

		DubboGetNoteByIdListRequest getNoteListReq = new DubboGetNoteByIdListRequest();

		List<Long> noteIdList = dubboResp.getNoteIdList();
		
		if(Collections3.isEmpty(noteIdList))
		{
			return;
		}
		
		getNoteListReq.setNoteIdList(noteIdList);

		DubboGetNoteByIdListResponse getNoteListResp = dubboNoteService.queryNoteByIdList(getNoteListReq);

		if (DubboReturnCode.SUCCESS != getNoteListResp.getCode()) {
			throw new ControllerException(getNoteListResp.getCode(), getNoteListResp.getDesc());
		}

		List<CommonNoteInfo> commonNoteInfoList = BeanMapper.map(getNoteListResp.getNoteList(), CommonNoteInfo.class);
		commonNoteService.fillImgInfo(commonNoteInfoList);
		commonNoteService.fillUserInfo(commonNoteInfoList);
		commonNoteService.fillCommentNumInfo(commonNoteInfoList);

		if (!Collections3.isEmpty(commonNoteInfoList)) {
			temp.setNoteList(BeanMapper.map(commonNoteInfoList, ClientPublicNoteInfo.class));
		}
	}

	/**
	 * 删除专辑
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "delalbum", method = RequestMethod.POST)
	public ClientBasicResponse delAlbum(@RequestBody ClientDelAlbumRequest req) {
		DubboDelAlbumRequest dubboReq = BeanMapper.map(req, DubboDelAlbumRequest.class);

		DubboBasicResponse dubboResp = dubboAlbumService.delAblum(dubboReq);

		if (DubboReturnCode.SUCCESS != dubboResp.getCode()) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		return new ClientBasicResponse();
	}

	/**
	 * 获取专辑内容
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "getalbumcontent", method = RequestMethod.POST)
	public ClientBasicResponse getAlbumContent(@RequestBody ClientGetAlbumContentRequest req) {
		DubboGetAlbumContentRequest dubboReq = BeanMapper.map(req, DubboGetAlbumContentRequest.class);

		DubboGetAlbumContentResponse dubboResp = dubboCommentService.getAlbumContent(dubboReq);

		if (DubboReturnCode.SUCCESS != dubboResp.getCode()) {
			return new ClientBasicResponse(dubboResp.getCode(), dubboResp.getDesc());
		}

		DubboGetNoteByIdListRequest getNoteListReq = new DubboGetNoteByIdListRequest();

		getNoteListReq.setNoteIdList(dubboResp.getNoteIdList());

		DubboGetNoteByIdListResponse getNoteListResp = dubboNoteService.queryNoteByIdList(getNoteListReq);

		if (DubboReturnCode.SUCCESS != getNoteListResp.getCode()) {
			return new ClientBasicResponse(getNoteListResp.getCode(), getNoteListResp.getDesc());
		}

		List<CommonNoteInfo> commonNoteInfoList = BeanMapper.map(getNoteListResp.getNoteList(), CommonNoteInfo.class);
		commonNoteService.fillImgInfo(commonNoteInfoList);
		commonNoteService.fillUserInfo(commonNoteInfoList);
		commonNoteService.fillCommentNumInfo(commonNoteInfoList);

		ClientGetAlbumContentResponse resp = new ClientGetAlbumContentResponse();
		resp.setNoteList(BeanMapper.map(commonNoteInfoList, ClientPublicNoteInfo.class));
		return resp;
	}
}
