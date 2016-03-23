package com.ninesale.valinor.item.api.model.item.request;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-商品 Request类
 * @author fxj
 * @date 2015年11月30日12:00:59
 */
public class DubboAddItemRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 商品标题
	 */
	@NotNull(message = "商品标题不能为空")
	private String title;
	/**
	 * 类目ID
	 */
	@NotNull(message = "类目ID不能为空")
    private Integer categLvlId;
    /**
	 * 品牌ID
	 */
	@NotNull(message = "品牌ID不能为空")
    private Long brandId;
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
	 * 商品主图
	 */
	@NotNull(message = "商品主图不能为空")
    private Long mainImgId;
    /**
	 * 商品扩展图
	 */
    private String assistImgIds;
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
	 * 上市时间
	 */
    private Date timeToMarket;
    /**
	 *商品详情
	 */
    @NotNull(message = "商品详情不能为空")
    private String itemDesc;
   
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCategLvlId() {
		return categLvlId;
	}

	public void setCategLvlId(Integer categLvlId) {
		this.categLvlId = categLvlId;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
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

	public String getAssistImgIds() {
		return assistImgIds;
	}

	public void setAssistImgIds(String assistImgIds) {
		this.assistImgIds = assistImgIds;
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

	public Date getTimeToMarket() {
		return timeToMarket;
	}

	public void setTimeToMarket(Date timeToMarket) {
		this.timeToMarket = timeToMarket;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
    
}
