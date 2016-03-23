package com.ninesale.valinor.image.api.model.response;

import java.util.List;

import com.ninesale.valinor.image.api.model.dto.DubboImgRespInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片管理Response类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryImgTagResponse extends DubboBasicResponse {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 图片&图片类型&图片标签&图片标签位置信息
	 */
	private List<DubboImgRespInfo> imgList;

	public List<DubboImgRespInfo> getImgList() {
		return imgList;
	}

	public void setImgList(List<DubboImgRespInfo> list) {
		this.imgList = list;
	}
}
