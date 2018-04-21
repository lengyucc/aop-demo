package org.spring.aop_demo.b;

import org.spring.aop_demo.b.service.DemoService;
import org.spring.aop_demo.b.service.impl.DemoServiceImpl;
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
