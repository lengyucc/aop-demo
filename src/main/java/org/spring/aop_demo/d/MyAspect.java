package org.spring.aop_demo.d;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// 限制入参对象上有指定注解
//	@Before("@args(org.spring.aop_demo.d.Name)")
	@Before("@args(org.spring.aop_demo.d.Name,org.spring.aop_demo.d.Name)")
	public void before() {
		System.out.println("========== before");
	}

//	@After("@args(org.spring.aop_demo.d.Name)")
	@After("@args(org.spring.aop_demo.d.Name,org.spring.aop_demo.d.Name)")
	public void after() {
		System.out.println("========== after");
	}

}
