package com.xworkz.school.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "school_table")
public class SchoolDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "student_age")
	private int age;
	@Column(name = "student_email")
	private String email;
	@Column(name = "student_phoneNo")
	private String phoneNo;

	public SchoolDto(String name, int age, String email, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public SchoolDto(String name, String phoneNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
	}

}
