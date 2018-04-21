package org.spring.aop_demo.d.service.impl;

import org.spring.aop_demo.d.Address;
import org.spring.aop_demo.d.Name;
import org.spring.aop_demo.d.Person;
import org.spring.aop_demo.d.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Name
	public void show(String name) {
		System.out.println("My name is " + name + ".");
	}

	public void show(Person person) {
		System.out.println(person);

	}

	public void show(Person person, Address address) {
		System.out.println(person + ", " + address);
	}
}
