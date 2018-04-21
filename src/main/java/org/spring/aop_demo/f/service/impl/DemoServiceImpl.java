package org.spring.aop_demo.f.service.impl;

import org.spring.aop_demo.f.service.DemoService;

public class DemoServiceImpl extends DemoService {
	public void show(String name) {
		System.out.println("我的名字叫 " + name + "。");
	}
}
