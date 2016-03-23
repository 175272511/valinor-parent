package com.ninesale.valinor.image.api.model.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 图片管理DTO类 创建人：fuxingjian 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboDelImgStoreListRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * id主键
	 */
	@NotNull(message = "图片ID列表不能为空")
	private List<Long> ids;

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

}
