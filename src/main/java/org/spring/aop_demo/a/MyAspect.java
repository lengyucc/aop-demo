package org.spring.aop_demo.a;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	// 限制方法匹配的字符串格式
	@Before("execution(* org.spring.aop_demo.a.service.*.*(..))")
	public void before() {
		System.out.println("========== before");
	}

	@After("execution(* org.spring.aop_demo.a.service.*.*(..))")
	public void after() {
		System.out.println("========== after");
	}

}
