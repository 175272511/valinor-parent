package com.ninesale.valinor.baseinfo.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoItemTag extends BasicModel{
    private Long id;

    private String itemTagName;

    private Long brandTagId;

    private Long imgId;

    private Long modifyUserId;

    private String modifyUserName;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemTagName() {
        return itemTagName;
    }

    public void setItemTagName(String itemTagName) {
        this.itemTagName = itemTagName;
    }

    public Long getBrandTagId() {
        return brandTagId;
    }

    public void setBrandTagId(Long brandTagId) {
        this.brandTagId = brandTagId;
    }

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
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