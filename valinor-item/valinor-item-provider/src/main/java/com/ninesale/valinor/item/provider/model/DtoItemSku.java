package com.ninesale.valinor.item.provider.model;

import java.math.BigDecimal;
import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoItemSku extends BasicModel {
	private Long id;

	private Long spuId;

	private String title;

	private String attrList;

	private String attrValueList;

	private Integer categLvl1Id;

	private Integer categLvl2Id;

	private Integer categLvl3Id;

	private Long brandId;

	private Integer status;

	private String artNo;

	private String barCode;

	private Long mainImgId;

	private String mainImgUrl;

	private BigDecimal markedPrice;

	private BigDecimal sellprice;

	private String weight;

	private String volume;

	private Date lastUpTime;

	private Date lastDownTime;

	private Long skuSnapId;

	private Date createTime;

	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSpuId() {
		return spuId;
	}

	public void setSpuId(Long spuId) {
		this.spuId = spuId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAttrList() {
		return attrList;
	}

	public void setAttrList(String attrList) {
		this.attrList = attrList;
	}

	public String getAttrValueList() {
		return attrValueList;
	}

	public void setAttrValueList(String attrValueList) {
		this.attrValueList = attrValueList;
	}

	public Integer getCategLvl1Id() {
		return categLvl1Id;
	}

	public void setCategLvl1Id(Integer categLvl1Id) {
		this.categLvl1Id = categLvl1Id;
	}

	public Integer getCategLvl2Id() {
		return categLvl2Id;
	}

	public void setCategLvl2Id(Integer categLvl2Id) {
		this.categLvl2Id = categLvl2Id;
	}

	public Integer getCategLvl3Id() {
		return categLvl3Id;
	}

	public void setCategLvl3Id(Integer categLvl3Id) {
		this.categLvl3Id = categLvl3Id;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getArtNo() {
		return artNo;
	}

	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Long getMainImgId() {
		return mainImgId;
	}

	public void setMainImgId(Long mainImgId) {
		this.mainImgId = mainImgId;
	}

	public String getMainImgUrl() {
		return mainImgUrl;
	}

	public void setMainImgUrl(String mainImgUrl) {
		this.mainImgUrl = mainImgUrl;
	}

	public BigDecimal getMarkedPrice() {
		return markedPrice;
	}

	public void setMarkedPrice(BigDecimal markedPrice) {
		this.markedPrice = markedPrice;
	}

	public BigDecimal getSellprice() {
		return sellprice;
	}

	public void setSellprice(BigDecimal sellprice) {
		this.sellprice = sellprice;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public Date getLastUpTime() {
		return lastUpTime;
	}

	public void setLastUpTime(Date lastUpTime) {
		this.lastUpTime = lastUpTime;
	}

	public Date getLastDownTime() {
		return lastDownTime;
	}

	public void setLastDownTime(Date lastDownTime) {
		this.lastDownTime = lastDownTime;
	}

	public Long getSkuSnapId() {
		return skuSnapId;
	}

	public void setSkuSnapId(Long skuSnapId) {
		this.skuSnapId = skuSnapId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}