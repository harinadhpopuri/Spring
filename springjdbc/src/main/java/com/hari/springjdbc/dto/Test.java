package com.hari.springjdbc.dto;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.springjdbc.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springjdbc/dto/config.xml");
		EmployeeDAO empDao = (EmployeeDAO) context.getBean("empDao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Mary");
		employee.setLastName("Doe");
		//int result = empDao.create(employee);
		//int result = empDao.update(employee);
		//int result =empDao.delete(2);
		//Employee result = empDao.read(1);
		List<Employee> result = empDao.read();
		System.out.println("No of records deleted are :"+result);
		
		
	}

}
