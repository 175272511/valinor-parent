/**   
* @Title: TidManager.java 
* @Package com.pubpi.common 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年9月23日 上午10:28:39 
* @version V0.1
*/
package com.pubpi.common;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年9月23日 上午10:28:39
 * 
 */
public class TidManager {
	private static final ThreadLocal<String> TIDTREAD_LOCAL = new ThreadLocal<String>();

	/**
	 * 设置TID
	 * 
	 * @param str
	 */
	public static void setTid(String str) {
		TIDTREAD_LOCAL.set(str);
	}

	/**
	 * 获取TID
	 * 
	 * @return
	 */
	public static String getTid() {
		return TIDTREAD_LOCAL.get();
	}
}
