package org.spring.aop_demo.h;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public Performance performance() {
		return new DefaultPerformance();
	}

	@Bean
	public EncoreableIntroducer encoreableIntroducer() {
		return new EncoreableIntroducer();
	}
}
