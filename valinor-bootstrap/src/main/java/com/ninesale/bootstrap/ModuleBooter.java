package com.ninesale.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ModuleBooter {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		System.out.println("Service started.....");
		while (true) {
			try {
				Thread.sleep(1000000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
