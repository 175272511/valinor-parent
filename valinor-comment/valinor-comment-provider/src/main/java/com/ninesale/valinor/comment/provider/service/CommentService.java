/**   
* @Title: DtoOrderService.java 
* @Package com.ninesale.valinor.comment.provider.service 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月3日 上午10:24:39 
* @version V0.1
*/
package com.ninesale.valinor.comment.provider.service;

import com.ninesale.valinor.comment.provider.model.DtoNoteStatisticsInfo;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 上午10:24:39
 * 
 */
public interface CommentService {

	void addCommentInfo(DtoNoteStatisticsInfo record);

	void updateShareNum(Long noteId);

	void updatePraiseNum(Long noteId);

	void updateCollectNum(Long noteId);

	void updateCommentNum(Long noteId);

	void updateviewNum(Long noteId);

}
