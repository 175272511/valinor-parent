package com.ninesale.valinor.item.api.model.spu.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

/**
 * SPU Dubbo类
 * 创建人：fuxingjian   
 * 创建时间：2015年11月10日 上午10:00:00
 */
public class DubboItemSpu extends BasicSeriModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8983920880722558846L;
	
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
    
    /**
	 * 商品主图列表JSON逗号隔开
	 */
    private String mainImgIds;
    
    /**
	 * 商品主图下载字符串列表JSON逗号隔开
	 */
    private String mainImgList;
    
    /**
	 * 商品介绍图片列表JSON逗号隔开
	 */
    private String profileImgIds;
    
    /**
	 * 商品介绍图片下载字符串列表JSON逗号隔开
	 */
    private String profileImgList;
    
    /**
	 * 礼品SKUID列表逗号隔开
	 */
    private String giftSkuList;
    
    /**
	 * 属性ID列表
	 */
    private String attrList;
    
    /**
	 * 创建时间
	 */
    private Date createTime;
    
    /**
	 * 最后修改时间
	 */
    private Date updateTime;

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

    public String getMainImgIds() {
        return mainImgIds;
    }

    public void setMainImgIds(String mainImgIds) {
        this.mainImgIds = mainImgIds;
    }

    public String getMainImgList() {
        return mainImgList;
    }

    public void setMainImgList(String mainImgList) {
        this.mainImgList = mainImgList;
    }

    public String getProfileImgIds() {
        return profileImgIds;
    }

    public void setProfileImgIds(String profileImgIds) {
        this.profileImgIds = profileImgIds;
    }

    public String getProfileImgList() {
        return profileImgList;
    }

    public void setProfileImgList(String profileImgList) {
        this.profileImgList = profileImgList;
    }

    public String getGiftSkuList() {
        return giftSkuList;
    }

    public void setGiftSkuList(String giftSkuList) {
        this.giftSkuList = giftSkuList;
    }

    public String getAttrList() {
        return attrList;
    }

    public void setAttrList(String attrList) {
        this.attrList = attrList;
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