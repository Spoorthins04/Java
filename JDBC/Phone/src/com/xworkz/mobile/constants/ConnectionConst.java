package com.xworkz.mobile.constants;

public enum ConnectionConst {
	URL("jdbc:mysql://localhost:3306/mobile_db"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
