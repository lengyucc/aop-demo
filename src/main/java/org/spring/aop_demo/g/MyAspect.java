package org.spring.aop_demo.g;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// 限制为带有指定注解的类 
	@Before("@target(org.spring.aop_demo.g.Name)")
	public void before() {
		System.out.println("========== before");
	}

	@After("@target(org.spring.aop_demo.g.Name)")
	public void after() {
		System.out.println("========== after");
	}

}
