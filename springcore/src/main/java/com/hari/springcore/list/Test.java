package com.hari.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/list/listconfig.xml");
		Hospital bean = (Hospital) context.getBean("hospital");
		System.out.println("Bean Name : "+bean.getName());
		System.out.println("Departments : "+bean.getDepartments());
		//Default Array List will be created by Spring Context for a List
		System.out.println("Departments : "+bean.getDepartments().getClass());

	}

}
