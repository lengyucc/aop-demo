package org.spring.aop_demo.b.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.spring.aop_demo.b.NeedRecord;
import org.spring.aop_demo.b.service.DemoService;

public class DemoServiceImpl implements DemoService {
	private static final DateFormat DF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public void show(String name) {
		System.out.println("My name is " + name + ".");
	}

	@NeedRecord
	public void print(String str) {
		System.out.println(DF.format(new Date()) + ": " + str);
	}

}
