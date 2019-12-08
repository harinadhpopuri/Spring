package com.hari.springadvanced.stereotype.annotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springadvanced/stereotype/annotaions/config.xml");
		Instructor instructor1 = (Instructor) context.getBean("instructor");
		
		System.out.println(instructor1);
		
		Instructor instructor2 = (Instructor) context.getBean("instructor");
		
		System.out.println(instructor2);

	}

}
