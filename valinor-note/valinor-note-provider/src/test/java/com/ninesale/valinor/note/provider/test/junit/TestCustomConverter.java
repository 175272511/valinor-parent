/**   
* @Title: TestCustomConverter.java 
* @Package com.ninesale.valinor.note.provider.test.junit 
* @Description: TODO(desc the file) 
* @author skyhawk wthuan@foxmail.com
* @date 2015年11月24日 下午2:57:57 
* @version V0.1
*/
package com.ninesale.valinor.note.provider.test.junit;

import java.util.List;

import org.dozer.CustomConverter;
import org.dozer.MappingException;

import com.alibaba.fastjson.JSON;

/**
 * @author skyhawk wthuan@foxmail.com
 * @date 2015年11月24日 下午2:57:57
 * 
 */
public class TestCustomConverter implements CustomConverter {

	public Object convert(Object destination, Object source, Class destClass, Class sourceClass) {
		if (source == null) {
			return null;
		}

		String dest = null;
		if (source instanceof List) {
			if (destination == null) {
				dest = "";
			}
			else {
				dest = (String) destination;
			}

			dest = JSON.toJSONString(source);

			return dest;

		}
		else if (source instanceof String) {

			return new Object();

		}
		else {
			throw new MappingException("ConverterTestCustomConverter " + "used incorrectly. Arguments passed inwere:" + destination + " and " + source);
		}
	}
}
