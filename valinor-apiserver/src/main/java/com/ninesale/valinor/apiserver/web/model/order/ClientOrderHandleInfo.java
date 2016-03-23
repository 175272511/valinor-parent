/**   
* @Title: ClientOrderHandleInfo.java 
* @Package com.ninesale.valinor.apiserver.web.model.order 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月3日 下午8:53:00 
* @version V0.1
*/
package com.ninesale.valinor.apiserver.web.model.order;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月3日 下午8:53:00
 * 
 */
public class ClientOrderHandleInfo {

	private String handler;

	private String handleTime;

	private String handleInfo;

	/**
	 * @return the handler
	 */
	public String getHandler() {
		return handler;
	}

	/**
	 * @param handler
	 *            the handler to set
	 */
	public void setHandler(String handler) {
		this.handler = handler;
	}

	/**
	 * @return the handleTime
	 */
	public String getHandleTime() {
		return handleTime;
	}

	/**
	 * @param handleTime
	 *            the handleTime to set
	 */
	public void setHandleTime(String handleTime) {
		this.handleTime = handleTime;
	}

	/**
	 * @return the handleInfo
	 */
	public String getHandleInfo() {
		return handleInfo;
	}

	/**
	 * @param handleInfo
	 *            the handleInfo to set
	 */
	public void setHandleInfo(String handleInfo) {
		this.handleInfo = handleInfo;
	}
}
