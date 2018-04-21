package org.spring.aop_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Person person() {
		return new Person("张三", 24, '男');
	}
}
