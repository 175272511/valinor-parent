package com.ninesale.valinor.baseinfo.provider.model;

import java.util.Date;

import com.pubpi.common.model.BasicModel;

public class DtoAddress2Tag extends BasicModel{
    private Long id;

    private String addrTagName;

    private Long countryCityId;

    private Long imgId;

    private Long modifyUserId;

    private String modifyUserName;

    private Date createTime;

    private Date updateTime;
    
    private DtoBaseinfoCountry country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddrTagName() {
        return addrTagName;
    }

    public void setAddrTagName(String addrTagName) {
        this.addrTagName = addrTagName;
    }

    public Long getCountryCityId() {
        return countryCityId;
    }

    public void setCountryCityId(Long countryCityId) {
        this.countryCityId = countryCityId;
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

	public DtoBaseinfoCountry getCountry() {
		return country;
	}

	public void setCountry(DtoBaseinfoCountry country) {
		this.country = country;
	}
    
    
}