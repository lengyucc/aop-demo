package org.spring.aop_demo.d.service;

import org.spring.aop_demo.d.Address;
import org.spring.aop_demo.d.Person;

public interface DemoService {
	void show(String name);

	void show(Person person);
	
	void show(Person person,Address address);
}
