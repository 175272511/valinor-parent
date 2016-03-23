package com.ninesale.valinor.apiserver.web.model.item.request;

import java.math.BigDecimal;
import java.util.List;

import org.dozer.Mapping;

import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.ninesale.valinor.apiserver.web.model.item.vo.ClientImg;

/****
 * 更新商品信息Request
 * @author fxj
 * @date 2015年11月30日 上午11:00:00
 */
public class ClientUpdateItemRequest extends ClientBasicRequest{
	
	@Mapping(value="id")
	private Long itemId;
	
	private String title;

    private Integer categLvlId;

    private Long brandId;

    private String artNo;

    private String barCode;

    private BigDecimal sellprice;

    private String weight;

    private String volume;
    
    private Long timeToMarket;

    private String timeToMarketStr;

    private String itemDesc;

	private ClientImg mainImg;
	
	private List<ClientImg> assistImgList;

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

	public String getTimeToMarketStr() {
		return timeToMarketStr;
	}

	public void setTimeToMarketStr(String timeToMarketStr) {
		this.timeToMarketStr = timeToMarketStr;
	}

	public Long getTimeToMarket() {
		return timeToMarket;
	}

	public void setTimeToMarket(Long timeToMarket) {
		this.timeToMarket = timeToMarket;
	}
	
}