package org.spring.aop_demo.c;

import org.spring.aop_demo.c.service.DemoService;
import org.spring.aop_demo.c.service.impl.DemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public DemoService demoService() {
		return new DemoServiceImpl();
	}

	@Bean
	public MyAspect myAspect() {
		return new MyAspect();
	}
}
