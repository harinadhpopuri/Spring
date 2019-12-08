package com.hari.springcore.assesment3;

public class Address {
	private String line1;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	private String city;

}
