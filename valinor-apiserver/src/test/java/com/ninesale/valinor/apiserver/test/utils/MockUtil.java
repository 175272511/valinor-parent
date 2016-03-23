package com.ninesale.valinor.apiserver.test.utils;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.io.UnsupportedEncodingException;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.alibaba.fastjson.JSON;
import com.ninesale.valinor.apiserver.web.common.ClientBasicRequest;
import com.pubpi.common.exception.ServiceException;

public class MockUtil {
	/**
	 * mock
	 * 
	 * @param uri
	 * @param json
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static String mock(MockMvc mvc, String uri, String json) {
		try {
			return mvc.perform(post(uri, "json").characterEncoding("UTF-8").contentType(MediaType.APPLICATION_JSON).content(json.getBytes())).andReturn()
					.getResponse().getContentAsString();
		}
		catch (UnsupportedEncodingException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	public static String mock(MockMvc mvc, String uri, ClientBasicRequest json) {
		json.setTime(String.valueOf(System.currentTimeMillis()));
		return mock(mvc, uri, JSON.toJSONString(json));
	}

	/**
	 * 
	 * @param re
	 *            返回值
	 * @param object
	 *            要转换的对象
	 * @param testName
	 *            当前测试的对象
	 */
	public static <T> void check(String re, Class<T> object, String testName) {
		System.out.println(re);

	}

	/**
	 * 初始化版本信息。每次调用测试用力之前首先更新版本信息
	 * 
	 * @param mockMvc
	 * @param url
	 * @param fileId
	 * @param class1
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	public static <T> Long updateVersion(MockMvc mockMvc, String url, Long fileId, Class<T> class1) throws UnsupportedEncodingException, Exception {

		// String re = mock(mockMvc, url, fileId + "");
		//
		// T dto = PojoMapper.fromJsonAsObject(re, class1);
		//
		// Long version =
		// Long.parseLong(dto.getClass().getMethod("getVersion").invoke(dto).toString());
		// System.out.println("version = " + version);
		//
		// return version;
		return null;
	}
}
