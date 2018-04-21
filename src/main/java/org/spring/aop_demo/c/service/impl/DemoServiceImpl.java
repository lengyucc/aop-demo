package org.spring.aop_demo.c.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.spring.aop_demo.c.service.DemoService;

public class DemoServiceImpl implements DemoService {
	private static final DateFormat DF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void show(String name) {
		System.out.println("My name is " + name + ".");
	}

	public void print(String str) {
		print(new Date(), str);
	}

	public void print(Date date, String str) {
		System.out.println(DF.format(date) + ": " + str);
	}
}
