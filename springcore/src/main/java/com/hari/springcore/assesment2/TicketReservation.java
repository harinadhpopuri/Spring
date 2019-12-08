package com.hari.springcore.assesment2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@PostConstruct
	public void initialize() {
		System.out.println("Inside Initialize method");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp method");
	}
	

}
