package com.hari.springjdbc.assesment.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hari.springjdbc.assesment.dto.Passanger;

public class PassangerRowMapper implements RowMapper<Passanger> {

	@Override
	public Passanger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passanger p = new Passanger();
		p.setId(rs.getInt(1));
		p.setFirstName(rs.getString(2));
		p.setLastName(rs.getString(3));
		return p;
	}

}
