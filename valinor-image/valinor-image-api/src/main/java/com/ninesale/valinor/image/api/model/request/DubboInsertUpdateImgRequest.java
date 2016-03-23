package com.ninesale.valinor.image.api.model.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.ninesale.valinor.image.api.model.dto.DubboImg;
import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 新增图片、标签、标签位置管理Request类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboInsertUpdateImgRequest extends DubboBasicRequest {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * imgList
	 */
	@NotNull(message = "图片列表不能为空")
	private List<DubboImg> imgList;

	public List<DubboImg> getImgList() {
		return imgList;
	}

	public void setImgList(List<DubboImg> imgList) {
		this.imgList = imgList;
	}
	
}
