package com.ninesale.valinor.item.api.model.sku.request;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 新增sku、stock库存、sku快照、stock库存快照 Request类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月04日 上午10:00:00
 */
public class DubboAddItemSkuRequest extends DubboBasicRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6964645818493749665L;
	
	/**
	 * SPUID
	 */
	@NotNull(message = "SPUID不能为空")
	private Long spuId;
	/**
	 * SKU标题
	 */
	@NotNull(message = "SKU标题不能为空")
	private String title;
	/**
	 * 属性ID列表逗号隔开
	 */
	@NotNull(message = "属性ID列表不能为空")
	private String attrList;
	/**
	 * 属性值列表逗号隔开与属性ID列表一一对应
	 */
	@NotNull(message = "属性值列表不能为空")
	private String attrValueList;
	/**
	 * 一级类目ID
	 */
	@NotNull(message = "一级类目不能为空")
	private Integer categLvl1Id;
	/**
	 * 二级类目ID
	 */
	@NotNull(message = "二级类目不能为空")
	private Integer categLvl2Id;
	/**
	 * 三级类目ID
	 */
	@NotNull(message = "三级类目不能为空")
	private Integer categLvl3Id;
	/**
	 * 品牌ID
	 */
	@NotNull(message = "品牌ID不能为空")
	private Long brandId;
	/**
	 * 状态 上架.下架
	 */
	@NotNull(message = "状态不能为空")
	private Integer status;
	/**
	 * 生产商条码货号
	 */
	@NotNull(message = "生产商条码货号不能为空")
	private String artNo;
	/**
	 * 国际通行条形码
	 */
	@NotNull(message = "国际通行条形码不能为空")
	private String barCode;
	/**
	 * SKU主图
	 */
	@NotNull(message = "SKU主图不能为空")
	private Long mainImgId;
	/**
	 * SKU主图链接
	 */
	@NotNull(message = "SKU主图链接不能为空")
	private String mainImgUrl;
	/**
	 * 市场价
	 */
	@NotNull(message = "市场价不能为空")
	private BigDecimal markedPrice;
	/**
	 * 销售价
	 */
	@NotNull(message = "销售价不能为空")
	private BigDecimal sellprice;
	/**
	 * 重量
	 */
	@NotNull(message = "重量不能为空")
	private String weight;
	/**
	 * 体积
	 */
	@NotNull(message = "体积不能为空")
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
	 * 创建时间
	 */
	@NotNull(message = "创建时间不能为空")
	private Date createTime;
	/**
	 * 最后修改时间
	 */
	@NotNull(message = "最后修改时间不能为空")
	private Date updateTime;
	
    /**
	 * 成本价
	 */
	@NotNull(message = "成本价不能为空")
    private BigDecimal costPrice;
    /**
	 * 库存可用数量
	 */
	@NotNull(message = "库存可用数量不能为空")
    private Integer stockNum;
    /**
	 * 销售锁定数量
	 */
	@NotNull(message = "销售锁定数量不能为空")
    private Integer orderLockNum;
    /**
	 * 付款锁定数量
	 */
	@NotNull(message = "付款锁定数量不能为空")
    private Integer payLockNum;
    /**
	 * 活动预锁定库存数量
	 */
	@NotNull(message = "活动预锁定库存数量不能为空")
    private Integer actvPreLockNum;
    /**
	 * 活动销售锁定数量
	 */
	@NotNull(message = "活动销售锁定数量不能为空")
    private Integer actvOrderLockNum;
    /**
	 * 活动付款锁定数量
	 */
	@NotNull(message = "活动付款锁定数量不能为空")
    private Integer actvPayLockNum;
    /**
	 * 库存销售总数
	 */
	@NotNull(message = "库存销售总数不能为空")
    private Integer orderTotalNum;
    /**
	 * 库存付款总数
	 */
	@NotNull(message = "库存付款总数不能为空")
    private Integer payTotalNum;
    /**
	 * 预计发货时间,小时
	 */
	@NotNull(message = "预计发货时间,小时不能为空")
    private Integer exptDlvHours;
	
	/**
	 * 修改用户ID
	 */
	@NotNull(message = "修改用户ID不能为空")
	private Long modifyUserId;
	/**
	 * 修改用户名
	 */
	@NotNull(message = "修改用户名不能为空")
	private String modifyUserName;
    
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
	public BigDecimal getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}
	public Integer getStockNum() {
		return stockNum;
	}
	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}
	public Integer getOrderLockNum() {
		return orderLockNum;
	}
	public void setOrderLockNum(Integer orderLockNum) {
		this.orderLockNum = orderLockNum;
	}
	public Integer getPayLockNum() {
		return payLockNum;
	}
	public void setPayLockNum(Integer payLockNum) {
		this.payLockNum = payLockNum;
	}
	public Integer getActvPreLockNum() {
		return actvPreLockNum;
	}
	public void setActvPreLockNum(Integer actvPreLockNum) {
		this.actvPreLockNum = actvPreLockNum;
	}
	public Integer getActvOrderLockNum() {
		return actvOrderLockNum;
	}
	public void setActvOrderLockNum(Integer actvOrderLockNum) {
		this.actvOrderLockNum = actvOrderLockNum;
	}
	public Integer getActvPayLockNum() {
		return actvPayLockNum;
	}
	public void setActvPayLockNum(Integer actvPayLockNum) {
		this.actvPayLockNum = actvPayLockNum;
	}
	public Integer getOrderTotalNum() {
		return orderTotalNum;
	}
	public void setOrderTotalNum(Integer orderTotalNum) {
		this.orderTotalNum = orderTotalNum;
	}
	public Integer getPayTotalNum() {
		return payTotalNum;
	}
	public void setPayTotalNum(Integer payTotalNum) {
		this.payTotalNum = payTotalNum;
	}
	public Integer getExptDlvHours() {
		return exptDlvHours;
	}
	public void setExptDlvHours(Integer exptDlvHours) {
		this.exptDlvHours = exptDlvHours;
	}
	public Long getModifyUserId() {
		return modifyUserId;
	}
	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}
	public String getModifyUserName() {
		return modifyUserName;
	}
	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}
	
}