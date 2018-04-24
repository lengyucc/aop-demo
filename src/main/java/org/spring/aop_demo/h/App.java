package org.spring.aop_demo.h;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示通过注解为bean引入新功能
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		Performance performance = applicationContext.getBean(Performance.class);
		
		Class<?>[] interfaces = performance.getClass().getInterfaces();
		for (Class<?> cls : interfaces) {
			System.out.println(cls.getName());
		}

		applicationContext.close();
	}
}
