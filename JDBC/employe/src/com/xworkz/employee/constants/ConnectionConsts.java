package com.xworkz.employee.constants;

public enum ConnectionConsts {

	URL("jdbc:mysql://localhost:3306/employee_db"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionConsts(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
