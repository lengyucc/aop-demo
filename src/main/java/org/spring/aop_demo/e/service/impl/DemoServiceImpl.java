package org.spring.aop_demo.e.service.impl;

import org.spring.aop_demo.e.service.DemoService;

public class DemoServiceImpl extends DemoService {
	public void show(String name) {
		System.out.println("我的名字叫 " + name + "。");
	}
}
