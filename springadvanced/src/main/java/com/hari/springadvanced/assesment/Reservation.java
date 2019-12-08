package com.hari.springadvanced.assesment;

public class Reservation {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	private String time;

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", time=" + time + "]";
	}

}
