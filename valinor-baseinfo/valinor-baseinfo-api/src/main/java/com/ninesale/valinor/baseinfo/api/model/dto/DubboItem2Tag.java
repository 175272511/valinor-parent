package com.ninesale.valinor.baseinfo.api.model.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

public class DubboItem2Tag extends BasicSeriModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String itemTagName;

    private Long brandTagId;

    private Long imgId;

    private Long modifyUserId;

    private String modifyUserName;

    private Date createTime;

    private Date updateTime;
    
    private DubboBrandTag brandTag;

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

	public DubboBrandTag getBrandTag() {
		return brandTag;
	}

	public void setBrandTag(DubboBrandTag brandTag) {
		this.brandTag = brandTag;
	}

}