package org.spring.aop_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);

		applicationContext.close();
	}
}
