package com.ninesale.valinor.userinfo.api.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DtoUserAddress implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8573198483640126610L;

	private Long id;
	
	private Long userId;

    private String province;

    private String city;

    private String area;

    private String road;

    private String address;

    private String linkman;

    private String phone;


    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Override
    public String toString(){
    	return ToStringBuilder.reflectionToString(this);
    }
}