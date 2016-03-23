package com.ninesale.valinor.item.api.model.item.request;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-商品 Request类
 * @author Zhoup
 * @date 2015年11月30日12:00:59
 */
public class DubboDownUpRecomHotItemRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 商品ID
	 */
	@NotNull(message = "商品ID不能为空")
	private Long id;
	
    /**
	 * 是否推荐 0:非推荐 1：推荐
	 */
    private Integer recommendItem;
    /**
	 * 是否热门  0:非热门 1：热门
	 */
    private Integer hotItem;
    
    /**
	 * 状态  0:上架 1:下架
	 */
    private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
   
}
