package org.spring.aop_demo.d;

import org.spring.aop_demo.d.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 此包及其子包演示Spring aop切点表达式@args()的使用
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		DemoService demoService = applicationContext.getBean(DemoService.class);
		demoService.show("ZhangSan");
		demoService.show(new Person());
		demoService.show(new Person(), new Address());

		applicationContext.close();
	}
}
