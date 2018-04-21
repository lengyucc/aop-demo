package org.spring.aop_demo.a.service.impl;

import org.spring.aop_demo.a.service.DemoService;

public class DemoServiceImpl implements DemoService {

	public void show(String name) {
		System.out.println("My name is " + name + ".");
	}

}
