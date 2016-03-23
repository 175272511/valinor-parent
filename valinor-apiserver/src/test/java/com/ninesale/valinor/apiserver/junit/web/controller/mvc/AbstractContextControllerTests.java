package com.ninesale.valinor.apiserver.junit.web.controller.mvc;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninesale.valinor.apiserver.test.utils.ShiroTestUtils;
import com.ninesale.valinor.auth.api.model.User;

@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:spring/applicationContext.xml", "classpath*:spring/spring-shiro.xml", "classpath*:spring/spring-mvc.xml",
		"classpath*:spring/spring-jedis.xml" })
public class AbstractContextControllerTests {
	protected static ObjectMapper mapper = new ObjectMapper();

	protected MockMvc mockMvc;
	@Resource
	protected WebApplicationContext wac;

	@Before
	public void setUp() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

		Object principal = new Object();
		ShiroTestUtils.mockSubject(principal);
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();

		final User user = new User();
		user.setUsername("admin");
		user.setId(1L);
		user.setRoleId(90);
		user.setCreateTime(new Timestamp(System.currentTimeMillis()));
		session.setAttribute("userInfo", user);
	}

	/**
	 * 获取返回码
	 * 
	 * @param result
	 * @return
	 */
	public static int getCode(String result) {
		JSONObject jsonObj = JSON.parseObject(result);
		return jsonObj.getIntValue("code");
	}
}
