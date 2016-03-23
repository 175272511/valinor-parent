package com.ninesale.valinor.image.api.model.response;

import java.util.List;

import com.ninesale.valinor.image.api.model.dto.DubboImgTag;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片标签Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQueryTagResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	/**
	 * 图片标签List
	 */
	private List<DubboImgTag> imgTag;

	public List<DubboImgTag> getImgTag() {
		return imgTag;
	}

	public void setImgTag(List<DubboImgTag> imgTag) {
		this.imgTag = imgTag;
	}
	
}
