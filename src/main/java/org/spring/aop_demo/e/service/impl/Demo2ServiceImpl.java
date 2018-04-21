package org.spring.aop_demo.e.service.impl;

import org.spring.aop_demo.e.service.DemoService;

public class Demo2ServiceImpl extends DemoService {
	public void show(String name) {
		System.out.println("My name is " + name + ".");
	}
}
