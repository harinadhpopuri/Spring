package com.hari.springcore.assesment4;

public class PropertiesPlaceholder {
	private String url;
	private String userName;
	private String password;
	
	PropertiesPlaceholder(String url, String userName, String password ){
		this.userName =userName;
		this.url = url;
		this.password = password;
		
		System.out.println(this.userName);
		System.out.println(this.url);
		System.out.println(this.password);
	}
	

}
