package com.ninesale.valinor.image.api.model.dto;

import java.util.Date;
import java.util.List;

import com.pubpi.common.model.BasicSeriModel;

public class DubboImgTagGroupRespInfo extends BasicSeriModel {
	/**
	 * @Fields serialVersionUID : TODO(desc the field)
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键ID
	 */
	private Long imgTagGroupId;
	/**
	 * 图片ID
	 */
	private Long imgId;
	/**
	 * 标签ID字符串逗号隔开
	 */
	private List<Long> imgTagIdList;
	/**
	 * 标签名称字符串逗号隔开
	 */
	private List<String> imgTagNameList;
	/**
	 * 标签组合定位X坐标
	 */
	private Integer coordX;
	/**
	 * 标签组合定位Y坐标
	 */
	private Integer coordY;
	/**
	 * 图片展现方式：0：U型，1：E型，2：X型
	 */
	private Integer showWay;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 更新日期
	 */
	private Date updateTime;
	/**
	 * 图片标签
	 */
	private List<DubboImgTagAndType> imgTagAndTypeList;

	public Long getImgTagGroupid() {
		return imgTagGroupId;
	}

	public void setImgTagGroupid(Long imgTagGroupid) {
		this.imgTagGroupId = imgTagGroupid;
	}

	public Long getImgId() {
		return imgId;
	}

	public void setImgId(Long imgId) {
		this.imgId = imgId;
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

	public List<DubboImgTagAndType> getImgTagAndTypeList() {
		return imgTagAndTypeList;
	}

	public void setImgTagAndTypeList(List<DubboImgTagAndType> imgTagAndTypeList) {
		this.imgTagAndTypeList = imgTagAndTypeList;
	}

}