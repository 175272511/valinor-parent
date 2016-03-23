package com.ninesale.valinor.note.provider.test.junit;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ninesale.valinor.note.api.model.request.topic.DubboDownUpTopicRequest;
import com.ninesale.valinor.note.api.service.DubboTopicService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class TestReportProvider {

	@Resource
	private DubboTopicService dubboTopicService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		downUpTopic();
	}
	
	public void downUpTopic(){
		
		DubboDownUpTopicRequest req = new DubboDownUpTopicRequest();
		req.setId(8L); 
		req.setValidFlag(1); 
		dubboTopicService.downUpTopic(req);
	}
	
	
}
