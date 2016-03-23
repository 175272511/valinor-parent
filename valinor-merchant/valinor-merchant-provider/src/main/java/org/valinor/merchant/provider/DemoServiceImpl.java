package org.valinor.merchant.provider;

import org.valinor.merchant.api.DemoService;

public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		return "Hello Dubbo,Hello " + name;
	}

}
