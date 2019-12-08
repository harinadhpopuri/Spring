package com.hari.springadvanced.stereotype.annotaions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Profile {
	@Value("Java Solution Specialist")
	String role;
	@Value("Deloitte")
	String company;
	@Override
	public String toString() {
		return "Profile [role=" + role + ", company=" + company + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
