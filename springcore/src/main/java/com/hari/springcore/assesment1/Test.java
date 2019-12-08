package com.hari.springcore.assesment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/assesment1/config.xml");
		ShoppingCart sCart = (ShoppingCart) context.getBean("shoppingCart");		
		System.out.println(sCart);

	}

}
