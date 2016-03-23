package com.ninesale.valinor.baseinfo.api.model.dto;

import java.util.Date;

import com.pubpi.common.model.BasicSeriModel;

public class DubboAddressTag extends BasicSeriModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private String addrTagName;

    private Long countryCityId;

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
}