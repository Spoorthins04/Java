package com.xworkz.cafe.dto;

import java.io.Serializable;

	public class CafeDTO implements Serializable{
		private String name;
		private String email;
		private String password;
		private long number;
		private int age;
		private String address;
		private int id;
		
		public CafeDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param name
		 * @param email
		 * @param password
		 * @param number
		 * @param age
		 * @param address
		 * @param id
		 */
		public CafeDTO(String name, String email, String password, long number, int age, String address, int id) {
			super();
			this.name = name;
			this.email = email;
			this.password = password;
			this.number = number;
			this.age = age;
			this.address = address;
			this.id = id;
		}

		@Override
		public String toString() {
			return "CafeDTO [name=" + name + ", email=" + email + ", password=" + password + ", number=" + number
					+ ", age=" + age + ", address=" + address + ", id=" + id + "]";
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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public long getNumber() {
			return number;
		}

		public void setNumber(long number) {
			this.number = number;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}
   
		
	}

