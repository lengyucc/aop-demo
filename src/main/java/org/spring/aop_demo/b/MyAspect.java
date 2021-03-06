package org.spring.aop_demo.b;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	// 限制方法上有指定注解
	@Before("@annotation(org.spring.aop_demo.b.NeedRecord)")
	public void before() {
		System.out.println("========== before");
	}

	@After("@annotation(org.spring.aop_demo.b.NeedRecord)")
	public void after() {
		System.out.println("========== after");
	}

}
