package com.hari.springjdbc.assesment.dao;

import java.util.List;

import com.hari.springjdbc.assesment.dto.Passanger;

public interface PassangerDao {
	
	int create(Passanger passanger);
	
	int update(Passanger passanger);
	
	int delete(int id);
	
	List<Passanger> read();
	
	Passanger read(int id);

}
