/**   
* @Title: BaseModel.java 
* @Package com.pubpi.common.model 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月2日 下午4:00:21 
* @version V0.1
*/
package com.pubpi.common.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 基础实体类，继承该类的实体类不用重写toString方法
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月2日 下午4:00:21
 * 
 */

public class BasicModel {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
