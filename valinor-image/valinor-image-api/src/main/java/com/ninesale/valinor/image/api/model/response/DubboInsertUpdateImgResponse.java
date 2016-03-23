package com.ninesale.valinor.image.api.model.response;

import java.util.List;

import com.ninesale.valinor.image.api.model.dto.DubboImgResInfo;
import com.pubpi.valinor.dubbo.base.model.DubboBasicResponse;

/**
 * 图片管理Response类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboInsertUpdateImgResponse extends DubboBasicResponse {
	
	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 返回图片ID和文件ID信息
	 * imgId:图片ID主键
	 * fileId:文件ID
	 * 
	 */
	private List<DubboImgResInfo> addImgReslist;

	public List<DubboImgResInfo> getAddImgReslist() {
		return addImgReslist;
	}

	public void setAddImgReslist(List<DubboImgResInfo> addImgReslist) {
		this.addImgReslist = addImgReslist;
	}

	
}
