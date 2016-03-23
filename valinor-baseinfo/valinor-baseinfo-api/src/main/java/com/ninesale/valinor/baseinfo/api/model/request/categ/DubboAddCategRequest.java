package com.ninesale.valinor.baseinfo.api.model.request.categ;

import javax.validation.constraints.NotNull;

import com.pubpi.valinor.dubbo.base.model.DubboBasicRequest;

/**
 * @des 添加：基础信息-种类 Request类
 * @author Zhoup
 * @date 2015年11月2日12:02:05
 */
public class DubboAddCategRequest extends DubboBasicRequest {

	private static final long serialVersionUID = 6825114663109315171L;

	/**
	 * 类目名称
	 */
	@NotNull(message = "类目名称不能为空")
	private String categName;
	/**
	 * 类目层级
	 */
	@NotNull(message = "类目层级不能为空")
	private Integer categLevel;
	/**
	 * 父目录ID
	 */
	@NotNull(message = "父目录ID不能为空")
	private Integer parentCategId;
	
	/**
	 * 用户ID
	 */
	@NotNull(message = "用户ID不能为空")
	private Long modifyUserId;

	/**
	 * 用户名称
	 */
	@NotNull(message = "用户名称不能为空")
	private String modifyUserName;
	
	public String getCategName() {
		return categName;
	}
	public void setCategName(String categName) {
		this.categName = categName;
	}
	public Integer getCategLevel() {
		return categLevel;
	}
	public void setCategLevel(Integer categLevel) {
		this.categLevel = categLevel;
	}
	public Integer getParentCategId() {
		return parentCategId;
	}
	public void setParentCategId(Integer parentCategId) {
		this.parentCategId = parentCategId;
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
