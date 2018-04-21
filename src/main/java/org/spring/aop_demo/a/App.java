package org.spring.aop_demo.a;

import org.spring.aop_demo.a.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 此包及其子包演示Spring aop切点表达式execution()的使用
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		DemoService demoService = applicationContext.getBean(DemoService.class);
		demoService.show("ZhangSan");

		applicationContext.close();
	}
}
