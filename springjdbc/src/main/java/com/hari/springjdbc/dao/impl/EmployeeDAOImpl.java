package com.hari.springjdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hari.springjdbc.dao.EmployeeDAO;
import com.hari.springjdbc.dao.rowmapper.EmployeeRowMapper;
import com.hari.springjdbc.dto.Employee;
@Component("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());

		return result;
	}

	@Override
	public int update(Employee emp) {
		String sql = "update employee set firstName=?,lastName=? where id=?";
		int result = jdbcTemplate.update(sql, emp.getFirstName(), emp.getLastName(), emp.getId());
		return result;
	}
	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);
		return result;
	}
	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return emp;
	}
	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowMapper);
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	



}
