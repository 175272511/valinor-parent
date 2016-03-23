/**   
* @Title: DubboBasicRequest.java 
* @Package com.pubpi.valinor.dubbo.base.model 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年10月28日 上午11:34:07 
* @version V0.1
*/
package com.pubpi.valinor.dubbo.base.model;

import com.pubpi.common.model.BasicSeriModel;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年10月28日 上午11:34:07
 * 
 */
public class DubboBasicRequest extends BasicSeriModel {

	/**
	 * @Fields serialVersionUID : TODO(desc the field)
	 */
	private static final long serialVersionUID = -1450673313672207744L;

	private String tid;

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
