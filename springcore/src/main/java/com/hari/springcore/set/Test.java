package com.hari.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/set/setconfig.xml");
		CarDealer bean = (CarDealer) context.getBean("carDealer");
		System.out.println("Bean Name : "+bean.getName());
		System.out.println("Departments : "+bean.getMakes());
		//Linked hashset will be the default class for Set
		System.out.println("Departments : "+bean.getMakes().getClass());
		
	}

}
