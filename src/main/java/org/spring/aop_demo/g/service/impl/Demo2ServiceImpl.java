package org.spring.aop_demo.g.service.impl;

import org.spring.aop_demo.g.Name;
import org.spring.aop_demo.g.service.DemoService;

@Name
public class Demo2ServiceImpl extends DemoService {
	public void show(String name) {
		System.out.println("My name is " + name + ".");
	}
}
