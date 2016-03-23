package com.ninesale.valinor.item.api.model.attr.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 查询商品属性值列表Response类 
 * 创建人：fuxingjian 
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboQueryItemAttrvalueListRequest extends DubboBasicRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964645818493749665L;

	/**
	 * 属性值ID
	 */
	private Long id;

	/**
	 * 属性值名称
	 */
	private String attrValueName;

	/**
	 * 属性ID
	 */
	private Long attrId;

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

	public String getAttrValueName() {
		return attrValueName;
	}

	public void setAttrValueName(String attrValueName) {
		this.attrValueName = attrValueName;
	}

	public Long getAttrId() {
		return attrId;
	}

	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

}