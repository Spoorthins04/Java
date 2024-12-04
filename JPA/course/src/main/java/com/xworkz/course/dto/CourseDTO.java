package com.xworkz.course.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="course_table")
@NamedQuery(name="findByName" ,query="select cd from CourseDTO cd where cd.name='Spoorthi'")
@NamedQuery(name="findByEmail" ,query="select cd from CourseDTO cd where cd.email='ammi@gmail.com'")
@NamedQuery(name="findByPhone" ,query="select cd from CourseDTO cd where cd.phone=9731276272")
@NamedQuery(name="findByAddress" ,query="select cd from CourseDTO cd where cd.address='Rajajinagara'")
@NamedQuery(name="findByNameAndPhone" ,query="select cd from CourseDTO cd where cd.name='Sheela' and cd.phone=8105869581")
@NamedQuery(name="findByNameAndEmail" ,query="select cd from CourseDTO cd where cd.name='preethu' and cd.email='preethu@gmail.com'")
@NamedQuery(name="findByPhoneAndEmail" ,query="select cd from CourseDTO cd where cd.phone=8105869581 and cd.email='spoorthi@gmail.com'")
public class CourseDTO {

	@Id
	private int id;
	private String name;
	private String address;
	private long phone;
	private int age;
	private String email;
	public CourseDTO()
	{
		super();
	}
	public CourseDTO(int id, String name, String address, long phone, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "CourseDTO [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age
				+ ", email=" + email + "]";
	}
	
	
	
}
