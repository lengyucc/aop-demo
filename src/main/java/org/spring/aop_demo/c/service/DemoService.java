package org.spring.aop_demo.c.service;

import java.util.Date;

public interface DemoService {
	void show(String name);

	void print(String str);

	void print(Date date, String str);
}
