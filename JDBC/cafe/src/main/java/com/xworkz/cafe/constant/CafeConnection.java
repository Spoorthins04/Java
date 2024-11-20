package com.xworkz.cafe.constant;

public enum CafeConnection {
	URL("jdbc:mysql://localhost:3306/cafe"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private CafeConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
