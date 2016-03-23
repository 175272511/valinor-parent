package com.ninesale.valinor.image.api.service;

import com.ninesale.valinor.image.api.model.request.DubboInsertUpdateImgRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryImgTagRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryTagRequest;
import com.ninesale.valinor.image.api.model.request.DubboQueryTagTypeRequest;
import com.ninesale.valinor.image.api.model.response.DubboInsertUpdateImgResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryImgTagResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryTagResponse;
import com.ninesale.valinor.image.api.model.response.DubboQueryTagTypeResponse;

/**
 * 图片标签接口类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月20日 下午3:00:00
 */
public interface DubboImgService {
	
	/**
	 * 创建图片&标签
	 * 1.图片存在(图片文件ID判断是否存在)
	 * 		1.1更新图片描述信息
	 *      1.2标签存在(标签类型ID和标签名称判断是否存在)
	 *      1.3标签不存在(标签类型ID和标签名称判断是否存在)
	 *      	1.3.1新增标签
	 *      1.4删除图片标签定位信息(图片ID删除)
	 *      1.5新增图片标签定位信息
	 * 2.图片不存在(图片文件ID判断是否存在)
	 * 		2.1保存图片信息
	 *      2.2标签存在(标签类型ID和标签名称判断是否存在)
	 *      2.3标签不存在(标签类型ID和标签名称判断是否存在)
	 *      	2.3.1新增标签
	 *      2.4新增图片标签定位信息
	 * @param  DubboInsertUpdateImgRequest request  
	 * @return DubboInsertUpdateImgResponse 图片ID
	 *
	 */
	public DubboInsertUpdateImgResponse insertUpdateImgAndTag(DubboInsertUpdateImgRequest request);
	
	/**
	 * 查询图片列表(图片基本VO&图片类型VO&标签位置VO列表(标签位置VO&标签VO列表))
	 * @param  DubboQueryImgTagRequest request
	 * @return DubboQueryImgTagResponse
	 * 图片相关信息(
	 * 	图片基本信息、
	 * 	图片类型VO、
	 * 	标签定位相关信息List(图片标签位置VO、标签List(标签VO))
	 * )
	 */
	public DubboQueryImgTagResponse queryImgList(DubboQueryImgTagRequest request);
	
	/**
	 * 查询标签
	 * @param  DubboQueryTagRequest request
	 * @return DubboQueryTagResponse 返回签名信息
	 */
	public DubboQueryTagResponse queryTagList(DubboQueryTagRequest request);
	
	/**
	 * 查询标签类型
	 * @param  DubboQueryTagTypeRequest request
	 * @return DubboQueryTagTypeResponse 返回标签类型信息
	 */
	public DubboQueryTagTypeResponse queryTagTypeList(DubboQueryTagTypeRequest request);
	
}
