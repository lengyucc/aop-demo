package org.spring.aop_demo.e;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// 限制为本身或其子类
	@Before("target(org.spring.aop_demo.e.service.DemoService)")
	public void before() {
		System.out.println("========== before");
	}

	@After("target(org.spring.aop_demo.e.service.DemoService)")
	public void after() {
		System.out.println("========== after");
	}

}
