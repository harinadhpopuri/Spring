package com.hari.springjdbc.assesment.dto;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hari.springjdbc.assesment.dao.PassangerDao;
import com.hari.springjdbc.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hari/springjdbc/assesment/dto/config.xml");
		PassangerDao pDao = (PassangerDao) context.getBean("passangerDao");
		Passanger p =  new Passanger();
		int result = 0;
		p.setId(1);
		p.setFirstName("Hari");
		p.setLastName("Popuri");		
		result = pDao.create(p);
		System.out.println("No of records created are :"+result);
		p.setId(2);
		p.setFirstName("John");
		p.setLastName("Doe");		
		result = pDao.create(p);
		System.out.println("No of records created are :"+result);
		p.setId(3);
		p.setFirstName("Mary");
		p.setLastName("Doe");		
		result = pDao.create(p);
		System.out.println("No of records created are :"+result);
		p.setId(3);
		p.setFirstName("Morgon");
		p.setLastName("Doe");	
		result = pDao.update(p);
		System.out.println("No of records updated are :"+result);
		
		result = pDao.delete(2);
		System.out.println("No of records deleted are :"+result);
		
		Passanger p1 = pDao.read(3);
		System.out.println("Passanger is :"+p1);
		
		List<Passanger> pl = pDao.read();
		System.out.println("Passangers are :"+pl);
		
		
	}

}
