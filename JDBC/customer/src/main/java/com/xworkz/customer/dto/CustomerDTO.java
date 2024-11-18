package com.xworkz.customer.dto;

public class CustomerDTO {

	String name;
	String email;
	String phNo;
	int age;
	String addNo;
	String panNo;

	public CustomerDTO(String name, String email, String phNo, int age, String addNo, String panNo) {
			this.name = name;
			this.email = email;
			this.panNo = panNo;
			this.age = age;
			this.addNo = addNo;
			this.phNo = phNo;
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addNo == null) ? 0 : addNo.hashCode());
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((panNo == null) ? 0 : panNo.hashCode());
		result = prime * result + ((phNo == null) ? 0 : phNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		if (addNo == null) {
			if (other.addNo != null)
				return false;
		} else if (!addNo.equals(other.addNo))
			return false;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (panNo == null) {
			if (other.panNo != null)
				return false;
		} else if (!panNo.equals(other.panNo))
			return false;
		if (phNo == null) {
			if (other.phNo != null)
				return false;
		} else if (!phNo.equals(other.phNo))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddNo() {
		return addNo;
	}

	public void setAddNo(String addNo) {
		this.addNo = addNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

}
