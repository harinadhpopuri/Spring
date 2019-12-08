package com.hari.springcore.assesment3;

import org.springframework.beans.factory.annotation.Required;

public class University {
	private int id;

	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	private String name;
	private Address location;

}
