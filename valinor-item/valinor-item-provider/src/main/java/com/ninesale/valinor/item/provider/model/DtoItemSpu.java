package com.ninesale.valinor.item.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoItemSpu extends BasicModel{
    private Long id;

    private String title;

    private String caption;

    private String slogan;

    private Integer categLvl1Id;

    private Integer categLvl2Id;

    private Integer categLvl3Id;

    private Long brandId;

    private Integer status;

    private String mainImgIds;

    private String mainImgList;

    private String profileImgIds;

    private String profileImgList;

    private String giftSkuList;

    private String attrList;

    private Date createTime;

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