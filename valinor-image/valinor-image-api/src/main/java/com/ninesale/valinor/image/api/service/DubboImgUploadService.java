package com.ninesale.valinor.image.api.service;

import com.ninesale.valinor.image.api.model.response.DubboImgUploadSignResponse;

/**
 * 图片管理接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年10月28日 下午3:00:00
 */
public interface DubboImgUploadService {
	
	/**
	 * 创建签名
	 * @return DubboImgUploadSignResponse 返回签名信息
	 */
	public DubboImgUploadSignResponse createSign();
	
}
