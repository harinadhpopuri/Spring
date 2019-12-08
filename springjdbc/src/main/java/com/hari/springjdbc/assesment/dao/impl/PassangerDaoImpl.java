package com.hari.springjdbc.assesment.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hari.springjdbc.assesment.dao.PassangerDao;
import com.hari.springjdbc.assesment.dto.Passanger;
import com.hari.springjdbc.assesment.rowmapper.PassangerRowMapper;
@Component("passangerDao")
public class PassangerDaoImpl implements PassangerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Passanger passanger) {
		String sql = "insert into passanger values(?,?,?)";
		int result = jdbcTemplate.update(sql,passanger.getId(),passanger.getFirstName(),passanger.getLastName());
		return result;
	}

	@Override
	public int update(Passanger passanger) {
		String sql = "update passanger set firstName=?, lastName=? where id=?";
		int result = jdbcTemplate.update(sql,passanger.getFirstName(),passanger.getLastName(),passanger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from passanger where id =?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public List<Passanger> read() {
		String sql = "select * from passanger";
		PassangerRowMapper rowMapper = new PassangerRowMapper();
		List<Passanger> result = jdbcTemplate.query(sql, rowMapper);
		return result;
	}

	@Override
	public Passanger read(int id) {
		String sql = "select * from passanger where id = ?";
		PassangerRowMapper rowMapper = new PassangerRowMapper();
		Passanger result = jdbcTemplate.queryForObject(sql, rowMapper,id);
		return result;
	}

}
