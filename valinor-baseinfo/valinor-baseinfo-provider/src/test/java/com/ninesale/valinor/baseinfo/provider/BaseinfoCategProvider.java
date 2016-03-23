package com.ninesale.valinor.baseinfo.provider;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ninesale.valinor.baseinfo.api.model.request.categ.DubboDownUpCategRequest;
import com.ninesale.valinor.baseinfo.api.service.DubboBaseinfoCategService;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class BaseinfoCategProvider {

	@Resource
	private DubboBaseinfoCategService dubboBaseinfoCategService;

	@Before
	public void setUp() {
	}

	@Test
	public void test() {
		updateByPrimaryKeySelective();
	}

	public void updateByPrimaryKeySelective() {
		DubboDownUpCategRequest req = new DubboDownUpCategRequest();
		req.setId(8L);
		req.setValidFlag(0);
		dubboBaseinfoCategService.downUpCateg(req);
	}
}
