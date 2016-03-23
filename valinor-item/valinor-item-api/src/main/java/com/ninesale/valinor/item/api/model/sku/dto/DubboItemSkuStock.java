package com.ninesale.valinor.item.api.model.sku.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.ninesale.valinor.item.api.model.stock.dto.DubboItemStock;
import com.pubpi.common.model.BasicSeriModel;

/**
 * SKU Stock Dubbo类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月10日 上午10:00:00
 */
public class DubboItemSkuStock extends BasicSeriModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7963775988317102321L;
	/**
	 * SKUID
	 */
	private Long id;
	/**
	 * SPUID
	 */
	private Long spuId;
	/**
	 * SKU标题
	 */
	private String title;
	/**
	 * 属性ID列表逗号隔开
	 */
	private String attrList;
	/**
	 * 属性值列表逗号隔开与属性ID列表一一对应
	 */
	private String attrValueList;
	/**
	 * 一级类目ID
	 */
	private Integer categLvl1Id;
	/**
	 * 二级类目ID
	 */
	private Integer categLvl2Id;
	/**
	 * 三级类目ID
	 */
	private Integer categLvl3Id;
	/**
	 * 品牌ID
	 */
	private Long brandId;
	/**
	 * 状态 上架.下架
	 */
	private Integer status;
	/**
	 * 生产商条码货号
	 */
	private String artNo;
	/**
	 * 国际通行条形码
	 */
	private String barCode;
	/**
	 * SKU主图
	 */
	private Long mainImgId;
	/**
	 * SKU主图链接
	 */
	private String mainImgUrl;
	/**
	 * 市场价
	 */
	private BigDecimal markedPrice;
	/**
	 * 销售价
	 */
	private BigDecimal sellprice;
	/**
	 * 重量
	 */
	private String weight;
	/**
	 * 体积
	 */
	private String volume;
	/**
	 * 最后上架时间
	 */
	private Date lastUpTime;
	/**
	 * 最后下架时间
	 */
	private Date lastDownTime;
	/**
	 * 快照版本号
	 */
	private Long skuSnapId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 最后修改时间
	 */
	private Date updateTime;
	
	/**
	 * sku对应的库存信息
	 */
	private DubboItemStock itemStock;
	
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

	public DubboItemStock getItemStock() {
		return itemStock;
	}

	public void setItemStock(DubboItemStock itemStock) {
		this.itemStock = itemStock;
	}
	
}