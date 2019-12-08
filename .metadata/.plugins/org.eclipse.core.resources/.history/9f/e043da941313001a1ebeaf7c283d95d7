package com.hari.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/properties/config.xml");
		CountriesAndLanguages bean = (CountriesAndLanguages) context.getBean("countriesAndLangs");
		System.out.println(bean);
		
	}

}
