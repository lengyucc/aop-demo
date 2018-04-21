package org.spring.aop_demo.f;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	// 限制为带有指定注解的类的本身或其子类，前提是注解定义为可继承@Inherited，经测试与@target一样
	@Before("@within(org.spring.aop_demo.f.Name)")
	public void before() {
		System.out.println("========== before");
	}

	@After("@within(org.spring.aop_demo.f.Name)")
	public void after() {
		System.out.println("========== after");
	}

}
