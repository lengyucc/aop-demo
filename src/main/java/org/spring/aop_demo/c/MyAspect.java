package org.spring.aop_demo.c;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// 限制方法参数
//	@Before("args(java.util.Date, java.lang.String)")
	@Before("args(java.lang.String)")
	public void before() {
		System.out.println("========== before");
	}

//	@After("args(java.util.Date, java.lang.String)")
	@After("args(java.lang.String)")
	public void after() {
		System.out.println("========== after");
	}

}
