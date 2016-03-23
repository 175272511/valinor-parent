package com.ninesale.valinor.baseinfo.api.model.request.categ;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 修改：基础信息-种类 Request类
 * @author Zhoup
 * @date 2015年11月2日14:12:04
 */
public class DubboUpdateCategRequest extends DubboBasicRequest{

	private static final long serialVersionUID = 6825114663109315171L;
	
	/**
	 * 类目ID
	 */
	@NotNull(message = "类目ID不能为空")
	private Long id;
	/**
	 * 类目名称
	 */
	@NotNull(message = "类目名称不能为空")
	private String categName;
	
	/**
	 * 修改用户ID
	 */
	private Long modifyUserId;

	/**
	 * 修改用户名
	 */
	private String modifyUserName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategName() {
		return categName;
	}

	public void setCategName(String categName) {
		this.categName = categName;
	}

	public Long getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(Long modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getModifyUserName() {
		return modifyUserName;
	}

	public void setModifyUserName(String modifyUserName) {
		this.modifyUserName = modifyUserName;
	}

}
