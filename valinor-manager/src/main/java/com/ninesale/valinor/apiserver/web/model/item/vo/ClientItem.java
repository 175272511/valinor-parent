package com.ninesale.valinor.apiserver.web.model.item.vo;

import java.math.BigDecimal;

import com.pubpi.common.model.BasicModel;

public class ClientItem extends BasicModel{
    private Long id;

    private String title;

    private Integer categLvlId;

    private Long brandId;

    private Integer status;

    private String artNo;

    private String barCode;

    private Long mainImgId;

    private String assistImgIds;

    private BigDecimal sellprice;

    private String weight;

    private String volume;

    private Long lastUpTime;

    private Long lastDownTime;

    private Long createTime;

    private Long updateTime;

    private Integer starLevel;

    private Long timeToMarket;

    private Integer recommendItem;

    private Integer hotItem;

    private String itemDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategLvlId() {
        return categLvlId;
    }

    public void setCategLvlId(Integer categLvlId) {
        this.categLvlId = categLvlId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getArtNo() {
        return artNo;
    }

    public void setArtNo(String artNo) {
        this.artNo = artNo;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Long getMainImgId() {
        return mainImgId;
    }

    public void setMainImgId(Long mainImgId) {
        this.mainImgId = mainImgId;
    }

    public String getAssistImgIds() {
        return assistImgIds;
    }

    public void setAssistImgIds(String assistImgIds) {
        this.assistImgIds = assistImgIds;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

	public Long getLastUpTime() {
		return lastUpTime;
	}

	public void setLastUpTime(Long lastUpTime) {
		this.lastUpTime = lastUpTime;
	}

	public Long getLastDownTime() {
		return lastDownTime;
	}

	public void setLastDownTime(Long lastDownTime) {
		this.lastDownTime = lastDownTime;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStarLevel() {
		return starLevel;
	}

	public void setStarLevel(Integer starLevel) {
		this.starLevel = starLevel;
	}

	public Long getTimeToMarket() {
		return timeToMarket;
	}

	public void setTimeToMarket(Long timeToMarket) {
		this.timeToMarket = timeToMarket;
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

	public String getItemDesc() {
		return itemDesc;
	}

}