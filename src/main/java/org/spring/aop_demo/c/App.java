package org.spring.aop_demo.c;

import java.util.Date;

import org.spring.aop_demo.c.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 此包及其子包演示Spring aop切点表达式args()的使用
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		DemoService demoService = applicationContext.getBean(DemoService.class);
		demoService.show("ZhangSan");
		demoService.print("aaaaaaaaaaa");
		demoService.print(new Date(), "bbbbbbbb");

		applicationContext.close();
	}
}
