/**   
* @Title: DubboBasicResponse.java 
* @Package com.pubpi.valinor.dubbo.base.model 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年10月28日 上午11:34:40 
* @version V0.1
*/
package com.pubpi.valinor.dubbo.base.model;

import java.util.UUID;

import com.pubpi.common.TidManager;
import com.pubpi.common.model.BasicSeriModel;
import com.pubpi.common.utils.StringUtils;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年10月28日 上午11:34:40
 * 
 */
public class DubboBasicResponse extends BasicSeriModel {

	/**
	 * @Fields serialVersionUID : TODO(desc the field)
	 */
	private static final long serialVersionUID = -5256827623745836527L;

	private String tid;

	/**
	 * 返回结果编码 0:代表成功 其他：代表异常
	 */
	private Integer code;

	/**
	 * 错误描述
	 */
	private String desc;

	public DubboBasicResponse() {
		super();
		this.code = DubboReturnCode.SUCCESS;
		this.desc = "success";

		tid = TidManager.getTid();
		if (StringUtils.isNull(tid)) {
			tid = UUID.randomUUID().toString().replace("-", "");
			TidManager.setTid(tid);
		}
	}

	public DubboBasicResponse(Integer code, String desc) {
		super();
		tid = TidManager.getTid();
		if (StringUtils.isNull(tid)) {
			tid = UUID.randomUUID().toString().replace("-", "");
			TidManager.setTid(tid);
		}
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(Integer resultCode) {
		this.code = resultCode;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String errorMsg) {
		this.desc = errorMsg;
	}

	/**
	 * @return the tid
	 */
	public String getTid() {
		return tid;
	}

	/**
	 * @param tid
	 *            the tid to set
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}

}
