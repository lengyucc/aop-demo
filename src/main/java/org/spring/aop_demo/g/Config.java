package org.spring.aop_demo.g;

import org.spring.aop_demo.g.service.DemoService;
import org.spring.aop_demo.g.service.impl.Demo2ServiceImpl;
import org.spring.aop_demo.g.service.impl.DemoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
	
	@Bean
	public DemoService demo3Service() {
		return new DemoService();
	}

	@Bean
	public DemoService demoService() {
		return new DemoServiceImpl();
	}

	@Bean
	public DemoService demo2Service() {
		return new Demo2ServiceImpl();
	}
	
	@Bean
	public MyAspect myAspect() {
		return new MyAspect();
	}
}
