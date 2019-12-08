package com.hari.springcore.constructorinjection;

public class Employee {
	private int id;
	private Address address;

	Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}
