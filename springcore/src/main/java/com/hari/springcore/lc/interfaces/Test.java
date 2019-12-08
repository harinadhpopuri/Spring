package com.hari.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springcore/lc/interfaces/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		
		//we need to register destroy hook to call destory method at end of destroying the application context.
		//Use AbstractApplicationContext - super class to ApplicationContext
		context.registerShutdownHook();
	}

}
