package com.ninesale.valinor.note.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.ninesale.valinor.note.api.model.dto.DubboAlbumInfo;
import com.ninesale.valinor.note.api.model.request.album.DubboAddAlbumRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboDelAlbumRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboGetAlbumContentRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboGetAlbumListRequest;
import com.ninesale.valinor.note.api.model.request.album.DubboUpdateAlbumRequest;
import com.ninesale.valinor.note.api.model.response.album.DubboAddAlbumResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboGetAlbumContentResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboGetAlbumListResponse;
import com.ninesale.valinor.note.api.model.response.album.DubboUpdateAlbumResponse;
import com.ninesale.valinor.note.api.service.DubboAlbumService;
import com.ninesale.valinor.note.provider.dao.AlbumContentMapper;
import com.ninesale.valinor.note.provider.dao.AlbumMapper;
import com.ninesale.valinor.note.provider.model.DtoAlbum;
import com.ninesale.valinor.note.provider.model.DtoAlbumContent;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

public class DubboAlbumServiceImpl implements DubboAlbumService {

	@Resource
	private AlbumMapper albumMapper;

	@Resource
	private AlbumContentMapper albumContentMapper;

	@Override
	public DubboAddAlbumResponse addAlbum(DubboAddAlbumRequest dubboReq) {
		DtoAlbum album = BeanMapper.map(dubboReq, DtoAlbum.class);
		albumMapper.insertSelective(album);

		DubboAlbumInfo albumInfo = BeanMapper.map(album, DubboAlbumInfo.class);

		DubboAddAlbumResponse dubboResp = new DubboAddAlbumResponse();
		dubboResp.setAlbumInfo(albumInfo);
		return dubboResp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboAlbumService#updateAlbum(com.
	 * ninesale.valinor.note.api.model.request.album.DubboUpdateAlbumRequest)
	 */
	@Override
	public DubboUpdateAlbumResponse updateAlbum(DubboUpdateAlbumRequest dubboReq) {
		DtoAlbum album = BeanMapper.map(dubboReq, DtoAlbum.class);
		albumMapper.updateByPrimaryKeySelective(album);

		DubboAlbumInfo albumInfo = BeanMapper.map(album, DubboAlbumInfo.class);

		DubboUpdateAlbumResponse dubboResp = new DubboUpdateAlbumResponse();
		dubboResp.setAlbumInfo(albumInfo);
		return dubboResp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboAlbumService#getAlbumList(com.
	 * ninesale.valinor.note.api.model.request.album.DubboGetAlbumListRequest)
	 */
	@Override
	public DubboGetAlbumListResponse getAlbumList(DubboGetAlbumListRequest dubboReq) {
		DtoAlbum record = new DtoAlbum();
		record.setUserId(dubboReq.getUserId());
		List<DtoAlbum> albumList = albumMapper.selectBySelective(record);
		List<DubboAlbumInfo> privateAlbumList = new ArrayList<DubboAlbumInfo>();
		List<DubboAlbumInfo> publicAlbumList = new ArrayList<DubboAlbumInfo>();

		for (DtoAlbum temp : albumList) {
			if (temp.getAlbumStatus() == 0) {
				publicAlbumList.add(BeanMapper.map(temp, DubboAlbumInfo.class));
			}
			else {
				privateAlbumList.add(BeanMapper.map(temp, DubboAlbumInfo.class));
			}
		}
		DubboGetAlbumListResponse dubboResp = new DubboGetAlbumListResponse();
		dubboResp.setPrivateAlbumList(privateAlbumList);
		dubboResp.setPublicAlbumList(publicAlbumList);

		return dubboResp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboAlbumService#delAblum(com.
	 * ninesale.valinor.note.api.model.request.album.DubboDelAlbumRequest)
	 */
	@Override
	public DubboBasicResponse delAblum(DubboDelAlbumRequest dubboReq) {
		DtoAlbum album = new DtoAlbum();
		album.setId(dubboReq.getAlbumId());
		album.setValidFlag(1);
		albumMapper.updateByPrimaryKeySelective(album);
		return new DubboBasicResponse();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.note.api.service.DubboAlbumService#getAlbumContent(
	 * com.ninesale.valinor.note.api.model.request.album.
	 * DubboGetAlbumContentRequest)
	 */
	@Override
	public DubboGetAlbumContentResponse getAlbumContent(DubboGetAlbumContentRequest dubboReq) {
		DtoAlbumContent record = new DtoAlbumContent();
		record.setAlbumId(dubboReq.getAlbumId());
		List<DtoAlbumContent> albumContentList = albumContentMapper.selectBySelective(record);

		List<Long> noteIdList = new ArrayList<Long>();
		for (DtoAlbumContent temp : albumContentList) {
			noteIdList.add(temp.getNoteId());
		}

		DubboGetAlbumContentResponse dubboResp = new DubboGetAlbumContentResponse();
		dubboResp.setNoteIdList(noteIdList);
		return dubboResp;
	}
}
