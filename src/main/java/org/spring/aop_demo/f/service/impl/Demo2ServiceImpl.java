package org.spring.aop_demo.f.service.impl;

import org.spring.aop_demo.f.service.DemoService;

public class Demo2ServiceImpl extends DemoService {
	public void show(String name) {
		System.out.println("My name is " + name + ".");
	}
}
