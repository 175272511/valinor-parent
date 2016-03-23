package com.ninesale.valinor.image.api.model.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.pubpi.common.model.BasicSeriModel;

public class DubboImgTagGroup extends BasicSeriModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2303715171594849868L;

	/**
	 * 标签组合定位X坐标
	 */
	@NotNull(message = "X坐标不能为空")
	private Integer coordX;
	/**
	 * 标签组合定位Y坐标
	 */
	@NotNull(message = "Y坐标不能为空")
	private Integer coordY;

	/**
	 * 图片展现方式
	 */
	@NotNull(message = "图片展现方式不能为空")
	private Integer showWay;

	// /**
	// * 图片标签List
	// * 暂时废弃
	// */
	// private List<DubboAddImgTag> imgTagList;

	/**
	 * 图片标签List
	 */
	private List<String> imgTagNameList;

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

	/**
	 * @return the imgTagNameList
	 */
	public List<String> getImgTagNameList() {
		return imgTagNameList;
	}

	/**
	 * @param imgTagNameList
	 *            the imgTagNameList to set
	 */
	public void setImgTagNameList(List<String> imgTagNameList) {
		this.imgTagNameList = imgTagNameList;
	}

	// public List<DubboAddImgTag> getImgTagList() {
	// return imgTagList;
	// }
	//
	// public void setImgTagList(List<DubboAddImgTag> imgTagList) {
	// this.imgTagList = imgTagList;
	// }

}