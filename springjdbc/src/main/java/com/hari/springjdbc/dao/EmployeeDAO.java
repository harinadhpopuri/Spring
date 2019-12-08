package com.hari.springjdbc.dao;

import java.util.List;

import com.hari.springjdbc.dto.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee emp);
	
	int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();

}
