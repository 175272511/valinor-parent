/**   
* @Title: ClientImgTagGroup.java 
* @Package com.ninesale.valinor.apiserver.web.model.note 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月20日 下午4:55:43 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.note;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pubpi.common.model.BasicModel;

/**
 * 图片标签信息
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月21日 下午2:07:36
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientImgTagGroup extends BasicModel {

	/**
	 * 图片标签列表
	 */
	private List<String> imgTagNameList;

	/**
	 * 坐标位置，百分比展示
	 */
	private Integer coordX;

	/**
	 * 坐标位置，百分比展示
	 */
	private Integer coordY;

	/**
	 * 展示方式
	 */
	private Integer showWay;

	/**
	 * @return the imgTagList
	 */
	public List<String> getImgTagNameList() {
		return imgTagNameList;
	}

	/**
	 * @param imgTagNameList
	 *            the imgTagList to set
	 */
	public void setImgTagNameList(List<String> imgTagNameList) {
		this.imgTagNameList = imgTagNameList;
	}

	/**
	 * @return the coordX
	 */
	public Integer getCoordX() {
		return coordX;
	}

	/**
	 * @param coordX
	 *            the coordX to set
	 */
	public void setCoordX(Integer coordX) {
		this.coordX = coordX;
	}

	/**
	 * @return the coordY
	 */
	public Integer getCoordY() {
		return coordY;
	}

	/**
	 * @param coordY
	 *            the coordY to set
	 */
	public void setCoordY(Integer coordY) {
		this.coordY = coordY;
	}

	/**
	 * @return the showWay
	 */
	public Integer getShowWay() {
		return showWay;
	}

	/**
	 * @param showWay
	 *            the showWay to set
	 */
	public void setShowWay(Integer showWay) {
		this.showWay = showWay;
	}
}
