package com.hari.springcore.assesment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/assesment3/config.xml");
		University university = (University) context.getBean("university");
		System.out.println(university.hashCode());
		
		University university1 = (University) context.getBean("university");
		System.out.println(university1.hashCode());
		
	}

}
