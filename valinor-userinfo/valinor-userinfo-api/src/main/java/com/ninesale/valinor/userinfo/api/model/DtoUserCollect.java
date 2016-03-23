/**
 * 
 */
package com.ninesale.valinor.userinfo.api.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author liuhui
 * 
 */
public class DtoUserCollect implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2955206278301911900L;

	private Long skuId;
	
	private String title;
	
	private String attrValueList;
	
	private String mainImgUrl;
	
	private Integer sellprice;

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAttrValueList() {
		return attrValueList;
	}

	public void setAttrValueList(String attrValueList) {
		this.attrValueList = attrValueList;
	}

	public String getMainImgUrl() {
		return mainImgUrl;
	}

	public void setMainImgUrl(String mainImgUrl) {
		this.mainImgUrl = mainImgUrl;
	}

	public Integer getSellprice() {
		return sellprice;
	}

	public void setSellprice(Integer sellprice) {
		this.sellprice = sellprice;
	}
	
	@Override
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
}
