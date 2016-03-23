package com.ninesale.valinor.comment.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.comment.api.model.DubboAddCommentRequest;
import com.ninesale.valinor.comment.api.model.DubboAddCommentResponse;
import com.ninesale.valinor.comment.api.model.DubboCollectInfo;
import com.ninesale.valinor.comment.api.model.DubboCollectNoteRequest;
import com.ninesale.valinor.comment.api.model.DubboCommentInfo;
import com.ninesale.valinor.comment.api.model.DubboDelCollectNoteRequest;
import com.ninesale.valinor.comment.api.model.DubboDelCommentRequest;
import com.ninesale.valinor.comment.api.model.DubboGetAlbumContentRequest;
import com.ninesale.valinor.comment.api.model.DubboGetAlbumContentResponse;
import com.ninesale.valinor.comment.api.model.DubboGetCommentListRequest;
import com.ninesale.valinor.comment.api.model.DubboGetCommentListResponse;
import com.ninesale.valinor.comment.api.model.DubboGetCommentNumInfoRequest;
import com.ninesale.valinor.comment.api.model.DubboGetCommentNumInfoResponse;
import com.ninesale.valinor.comment.api.model.DubboGetPraiseAndCollectRequest;
import com.ninesale.valinor.comment.api.model.DubboGetPraiseAndCollectResponse;
import com.ninesale.valinor.comment.api.model.DubboNoteStatisticsInfo;
import com.ninesale.valinor.comment.api.model.DubboPraiseInfo;
import com.ninesale.valinor.comment.api.model.DubboPraiseRequest;
import com.ninesale.valinor.comment.api.model.DubboShareNoteRequest;
import com.ninesale.valinor.comment.api.service.DubboCommentService;
import com.ninesale.valinor.comment.provider.dao.NoteCollectInfoMapper;
import com.ninesale.valinor.comment.provider.dao.NoteCommentMapper;
import com.ninesale.valinor.comment.provider.dao.NotePraiseMapper;
import com.ninesale.valinor.comment.provider.dao.NoteShareMapper;
import com.ninesale.valinor.comment.provider.dao.NoteStatisticsInfoMapper;
import com.ninesale.valinor.comment.provider.model.DtoNoteCollectInfo;
import com.ninesale.valinor.comment.provider.model.DtoNoteComment;
import com.ninesale.valinor.comment.provider.model.DtoNotePraise;
import com.ninesale.valinor.comment.provider.model.DtoNoteShare;
import com.ninesale.valinor.comment.provider.model.DtoNoteStatisticsInfo;
import com.ninesale.valinor.comment.provider.service.CommentService;
import com.pubpi.common.exception.DaoException;
import com.pubpi.common.utils.BeanMapper;
import com.pubpi.common.utils.Collections3;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;
import com.pubpi.valinor.dubbo.base.model.DubboReturnCode;

public class DubboCommentServiceImpl implements DubboCommentService {

	@Resource
	private NoteCommentMapper noteCommentMapper;

	@Resource
	private NoteCollectInfoMapper noteCollectInfoMapper;

	@Resource
	private NoteShareMapper noteShareMapper;

	@Resource
	private NotePraiseMapper notePraiseMapper;

	@Resource
	private NoteStatisticsInfoMapper noteStatisticsInfoMapper;

	@Resource
	private CommentService commentService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.comment.api.service.DemoOrderService#addOrder(com.
	 * ninesale.valinor.order.api.model.AddOrderRequest)
	 */
	@Override
	public DubboAddCommentResponse addComment(DubboAddCommentRequest request) {
		DtoNoteComment dtoNoteComment = BeanMapper.map(request, DtoNoteComment.class);

		dtoNoteComment.setReplyUserIdListStr(JSON.toJSONString(dtoNoteComment.getReplyUserIdList()));
		dtoNoteComment.setReplyUserNameListStr(JSON.toJSONString(dtoNoteComment.getReplyUserNameList()));

		noteCommentMapper.insertSelective(dtoNoteComment);
		dtoNoteComment = noteCommentMapper.selectByPrimaryKey(dtoNoteComment.getId());
		dtoNoteComment.setReplyUserIdList(JSON.parseArray(dtoNoteComment.getReplyUserIdListStr(), Long.class));
		dtoNoteComment.setReplyUserNameList(JSON.parseArray(dtoNoteComment.getReplyUserNameListStr(), String.class));

		DubboAddCommentResponse response = new DubboAddCommentResponse();

		DubboCommentInfo dubboCommentInfo = BeanMapper.map(dtoNoteComment, DubboCommentInfo.class);
		response.setCommentInfo(dubboCommentInfo);

		// 评论计数
		commentService.updateCommentNum(request.getNoteId());

		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.api.service.DubboCommentService#
	 * getCommentList(com.ninesale.valinor.comment.api.model.
	 * DubboGetCommentListRequest)
	 */
	@Override
	public DubboGetCommentListResponse getCommentList(DubboGetCommentListRequest dubboReq) {
		DtoNoteComment noteComment = BeanMapper.map(dubboReq, DtoNoteComment.class);
		List<DtoNoteComment> noteCommentList = noteCommentMapper.selectCommentList(noteComment, dubboReq.getBeginId(), dubboReq.getPageSize());
		if (!Collections3.isEmpty(noteCommentList)) {
			for (DtoNoteComment temp : noteCommentList) {
				temp.setReplyUserNameList(JSON.parseArray(temp.getReplyUserNameListStr(), String.class));
				temp.setReplyUserIdList(JSON.parseArray(temp.getReplyUserIdListStr(), Long.class));
			}
		}
		List<DubboCommentInfo> commentList = BeanMapper.map(noteCommentList, DubboCommentInfo.class);
		DubboGetCommentListResponse response = new DubboGetCommentListResponse();
		Integer totalNum = noteCommentMapper.selectCommentTotalNum(noteComment);
		response.setTotalNum(totalNum);
		response.setCurrentPage(dubboReq.getCurrentPage());
		response.setPageSize(dubboReq.getPageSize());

		response.setCommentList(commentList);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.comment.api.service.DubboCommentService#delComment(
	 * com.ninesale.valinor.comment.api.model.DubboDelCommentRequest)
	 */
	@Override
	public DubboBasicResponse delComment(DubboDelCommentRequest dubboReq) {
		noteCommentMapper.deleteByPrimaryKey(dubboReq.getCommentId());
		return new DubboBasicResponse();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.comment.api.service.DubboCommentService#collectNote(
	 * com.ninesale.valinor.comment.api.model.DubboCollectNoteRequest)
	 */
	@Override
	public DubboBasicResponse collectNote(DubboCollectNoteRequest dubboReq) {
		DtoNoteCollectInfo record = BeanMapper.map(dubboReq, DtoNoteCollectInfo.class);
		noteCollectInfoMapper.insertSelective(record);

		commentService.updateCollectNum(dubboReq.getNoteId());
		return new DubboBasicResponse();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.api.service.DubboCommentService#
	 * delCollectNote(com.ninesale.valinor.comment.api.model.
	 * DubboDelCollectNoteRequest)
	 */
	@Override
	public DubboBasicResponse delCollectNote(DubboDelCollectNoteRequest dubboReq) {

		DtoNoteCollectInfo record = new DtoNoteCollectInfo();
		record.setNoteId(dubboReq.getNoteId());

		noteCollectInfoMapper.updateValidFlag(record);

		return new DubboBasicResponse();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.api.service.DubboCommentService#
	 * getAlbumContent(com.ninesale.valinor.comment.api.model.
	 * DubboGetAlbumContentRequest)
	 */
	@Override
	public DubboGetAlbumContentResponse getAlbumContent(DubboGetAlbumContentRequest dubboReq) {
		DtoNoteCollectInfo record = new DtoNoteCollectInfo();
		record.setAlbumId(dubboReq.getAlbumId());
		List<DtoNoteCollectInfo> albumContentList = noteCollectInfoMapper.selectBySelective(record);

		List<Long> noteIdList = new ArrayList<Long>();
		for (DtoNoteCollectInfo temp : albumContentList) {
			noteIdList.add(temp.getNoteId());
		}

		DubboGetAlbumContentResponse dubboResp = new DubboGetAlbumContentResponse();
		dubboResp.setNoteIdList(noteIdList);
		return dubboResp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.ninesale.valinor.comment.api.service.DubboCommentService#shareNote(
	 * com.ninesale.valinor.comment.api.model.DubboShareNoteRequest)
	 */
	@Override
	public DubboBasicResponse shareNote(DubboShareNoteRequest dubboReq) {

		DtoNoteShare record = BeanMapper.map(dubboReq, DtoNoteShare.class);
		noteShareMapper.insertSelective(record);

		commentService.updateShareNum(dubboReq.getNoteId());
		return new DubboBasicResponse();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.api.service.DubboCommentService#
	 * getCommentNumInfo(com.ninesale.valinor.comment.api.model.
	 * DubboGetCommentNumInfoRequest)
	 */
	@Override
	public DubboGetCommentNumInfoResponse getCommentNumInfo(DubboGetCommentNumInfoRequest dubboReq) {
		List<DtoNoteStatisticsInfo> statisInfoList = noteStatisticsInfoMapper.selectByNoteIdList(dubboReq.getNoteIdList());
		DubboGetCommentNumInfoResponse dubboResp = new DubboGetCommentNumInfoResponse();
		dubboResp.setNoteStatisticsInfoList(BeanMapper.map(statisInfoList, DubboNoteStatisticsInfo.class));
		return dubboResp;
	}

	@Override
	public DubboBasicResponse praise(DubboPraiseRequest request) throws Exception {
		DtoNotePraise notePraise = BeanMapper.map(request, DtoNotePraise.class);
		notePraiseMapper.insertSelective(notePraise);

		commentService.updatePraiseNum(request.getNoteId());
		return new DubboBasicResponse();
	}

	@Override
	public DubboBasicResponse cancelPraise(DubboPraiseRequest request) throws Exception {
		DtoNotePraise notePraise = BeanMapper.map(request, DtoNotePraise.class);
		notePraiseMapper.deleteBySelective(notePraise);
		return new DubboBasicResponse();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ninesale.valinor.comment.api.service.DubboCommentService#
	 * getPraiseAndCollectList(com.ninesale.valinor.comment.api.model.
	 * DubboGetPraiseAndCollectRequest)
	 */
	@Override
	public DubboGetPraiseAndCollectResponse getPraiseAndCollectList(DubboGetPraiseAndCollectRequest dubboReq) {

		DtoNoteCollectInfo dtoNoteCollectInfo = BeanMapper.map(dubboReq, DtoNoteCollectInfo.class);
		List<DtoNoteCollectInfo> noteCollectInfoList = noteCollectInfoMapper.selectBySelective(dtoNoteCollectInfo);

		DtoNotePraise dtoPraise = BeanMapper.map(dubboReq, DtoNotePraise.class);
		List<DtoNotePraise> notePraiseList = notePraiseMapper.selectBySelective(dtoPraise);

		DubboGetPraiseAndCollectResponse dubboResp = new DubboGetPraiseAndCollectResponse();
		dubboResp.setCollectInfoList(BeanMapper.map(noteCollectInfoList, DubboCollectInfo.class));
		dubboResp.setPraiseInfoList(BeanMapper.map(notePraiseList, DubboPraiseInfo.class));

		return dubboResp;
	}
}
