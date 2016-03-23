package com.ninesale.valinor.apiserver.web.model.item.request;

import org.dozer.Mapping;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;

/****
 * 商品上架、下架、推荐、非推荐、热门、非热门Request
 * @author fxj
 * @date 2015年11月30日 上午11:00:00
 */
public class ClientDownUpRecomHotItemRequest extends ClientBasicRequest{
	/**
	 * 商品ID
	 */
	@Mapping(value="id")
	private Long itemId;
	/**
	 * 状态 0:上架 1:下架
	 */
	private Integer status;
	/**
	 * 0:非推荐 1：推荐
	 */
	private Integer recommendItem;
	/**
	 * 0:非热门 1：热门
	 */
	private Integer hotItem;
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getRecommendItem() {
		return recommendItem;
	}
	public void setRecommendItem(Integer recommendItem) {
		this.recommendItem = recommendItem;
	}
	public Integer getHotItem() {
		return hotItem;
	}
	public void setHotItem(Integer hotItem) {
		this.hotItem = hotItem;
	}
	
}