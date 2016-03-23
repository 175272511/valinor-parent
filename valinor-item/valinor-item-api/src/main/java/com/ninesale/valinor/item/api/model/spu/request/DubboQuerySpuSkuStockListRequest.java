package com.ninesale.valinor.item.api.model.spu.request;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * 查询SPUList Request类 
 * 创建人：fuxingjian 
 * 创建时间：2015年10月28日 下午3:00:00
 */
public class DubboQuerySpuSkuStockListRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * SPUID
	 */
	private Long id;

	/**
	 * SPUD标题
	 */
    private String title;
    
    /**
	 * 副标题
	 */
    private String caption;
    
    /**
	 * 促销语
	 */
    private String slogan;
    
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
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
    
}
