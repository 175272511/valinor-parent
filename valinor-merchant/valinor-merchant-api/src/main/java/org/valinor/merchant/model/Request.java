/**   
* @Title: Request.java 
* @Package org.valinor.merchant.model 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年10月27日 上午9:47:24 
* @version V0.1
*/
package org.valinor.merchant.model;

/** 
* @author skyhawk wthuan@foxmail.com
* @date 2015年10月27日 上午9:47:24 
*  
*/
public class Request {
	private String test;

	/**
	 * @return the test
	 */
	public String getTest() {
		return test;
	}

	/**
	 * @param test the test to set
	 */
	public void setTest(String test) {
		this.test = test;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Request [test=");
		builder.append(test);
		builder.append("]");
		return builder.toString();
	}
	
	
}
