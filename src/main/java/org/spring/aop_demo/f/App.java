package org.spring.aop_demo.f;

import org.spring.aop_demo.f.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 此包及其子包演示Spring aop切点表达式@within的使用
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		DemoService demo2Service = (DemoService) applicationContext.getBean("demo2Service");
		demo2Service.show("ZhangSan");

		DemoService demoService = (DemoService) applicationContext.getBean("demoService");
		demoService.show("李四");

		DemoService demo3Service = (DemoService) applicationContext.getBean("demo3Service");
		demo3Service.show("王二");

		applicationContext.close();
	}
}
