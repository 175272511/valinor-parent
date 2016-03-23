/**   
* @Title: BaseModel.java 
* @Package com.pubpi.common.model 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月2日 下午4:00:21 
* @version V0.1
*/
package com.pubpi.common.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 基础实体类，继承该类的实体类不用重写toString方法
 * 
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月2日 下午4:00:21
 * 
 */

public class BasicSeriModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
}
