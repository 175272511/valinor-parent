package com.ninesale.valinor.item.api.model.attr.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 查询商品属性列表Response类 创建人：fuxingjian 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboQueryItemAttrListRequest extends DubboBasicRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964645818493749665L;

	/**
	 * 属性ID
	 */
	private Long id;

	/**
	 * 属性名称
	 */
	private String attrName;

	/**
	 * 类目ID
	 */
	private Integer categId;

	/**
	 * 属性说明
	 */
	private String attrContext;

	/**
	 * 是否有效0有效
	 */
	private Integer validFlag;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttrName() {
		return attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public Integer getCategId() {
		return categId;
	}

	public void setCategId(Integer categId) {
		this.categId = categId;
	}

	public String getAttrContext() {
		return attrContext;
	}

	public void setAttrContext(String attrContext) {
		this.attrContext = attrContext;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

}