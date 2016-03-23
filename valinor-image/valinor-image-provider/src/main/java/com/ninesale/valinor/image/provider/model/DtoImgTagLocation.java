package com.ninesale.valinor.image.provider.model;

import java.util.Date;
import java.util.List;

public class DtoImgTagLocation {
    private Long id;

    private Long imgId;

    private String imgTagIdListStr;

    private String imgTagNameListStr;

    private Integer coordX;

    private Integer coordY;

    private Integer showWay;

    private Date createTime;

    private Date updateTime;
    
    private List<Long> imgTagIdList;

    private List<String> imgTagNameList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getImgId() {
		return imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public String getImgTagIdListStr() {
		return imgTagIdListStr;
	}

	public void setImgTagIdListStr(String imgTagIdListStr) {
		this.imgTagIdListStr = imgTagIdListStr;
	}

	public String getImgTagNameListStr() {
		return imgTagNameListStr;
	}

	public void setImgTagNameListStr(String imgTagNameListStr) {
		this.imgTagNameListStr = imgTagNameListStr;
	}

	public Integer getCoordX() {
		return coordX;
	}

	public void setCoordX(Integer coordX) {
		this.coordX = coordX;
	}

	public Integer getCoordY() {
		return coordY;
	}

	public void setCoordY(Integer coordY) {
		this.coordY = coordY;
	}

	public Integer getShowWay() {
		return showWay;
	}

	public void setShowWay(Integer showWay) {
		this.showWay = showWay;
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

	public List<Long> getImgTagIdList() {
		return imgTagIdList;
	}

	public void setImgTagIdList(List<Long> imgTagIdList) {
		this.imgTagIdList = imgTagIdList;
	}

	public List<String> getImgTagNameList() {
		return imgTagNameList;
	}

	public void setImgTagNameList(List<String> imgTagNameList) {
		this.imgTagNameList = imgTagNameList;
	}

	
}