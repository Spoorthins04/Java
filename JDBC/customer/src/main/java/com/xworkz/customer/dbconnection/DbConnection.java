package com.xworkz.customer.dbconnection;

public enum DbConnection {

URL("jdbc:mysql://localhost:3306/user"), USERNAME("root"), PASSWORD("Xworkzodc@123");
	
	private String value;
	
	private DbConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
