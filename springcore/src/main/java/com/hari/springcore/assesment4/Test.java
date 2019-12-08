package com.hari.springcore.assesment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/assesment4/config.xml");
		PropertiesPlaceholder pPlaceholder = (PropertiesPlaceholder) context.getBean("propertiesPlaceholder");
		
	}

}
