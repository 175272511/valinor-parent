package com.ninesale.valinor.apiserver.web.model.item.vo;

import java.math.BigDecimal;
import java.util.List;

import org.dozer.Mapping;

import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientBaseinfoBrand;
import com.ninesale.valinor.apiserver.web.model.baseinfo.vo.ClientBaseinfoCateg;
import com.pubpi.common.model.BasicModel;

public class ClientResItem extends BasicModel{
	
	@Mapping(value="id")
    private Long itemId;

    private String title;

    private Integer categLvlId;

    private Long brandId;

    private Integer status;

    private String artNo;

    private String barCode;

    private BigDecimal sellprice;

    private String weight;

    private String volume;

    private Long timeToMarket;

    private Integer recommendItem;

    private Integer hotItem;

    private String itemDesc;
    
    private Long mainImgId;

    private String assistImgIds;

	private ClientImg mainImg;
	
	private List<ClientImg> assistImgList;
	
	private ClientBaseinfoBrand brand;
	
	private ClientBaseinfoCateg categ;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
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

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public ClientImg getMainImg() {
		return mainImg;
	}

	public void setMainImg(ClientImg mainImg) {
		this.mainImg = mainImg;
	}

	public List<ClientImg> getAssistImgList() {
		return assistImgList;
	}

	public void setAssistImgList(List<ClientImg> assistImgList) {
		this.assistImgList = assistImgList;
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

	public ClientBaseinfoBrand getBrand() {
		return brand;
	}

	public void setBrand(ClientBaseinfoBrand brand) {
		this.brand = brand;
	}

	public ClientBaseinfoCateg getCateg() {
		return categ;
	}

	public void setCateg(ClientBaseinfoCateg categ) {
		this.categ = categ;
	}

	public Long getTimeToMarket() {
		return timeToMarket;
	}

	public void setTimeToMarket(Long timeToMarket) {
		this.timeToMarket = timeToMarket;
	}
	
}