package com.hari.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/map/mapconfig.xml");
		Customer bean = (Customer) context.getBean("customer");
		System.out.println(bean);
		
	}

}
