package com.hari.springadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springadvanced/standalone/collections/config.xml");
		ProductList pl = (ProductList) context.getBean("productList");
		
		System.out.println(pl);

	}

}
