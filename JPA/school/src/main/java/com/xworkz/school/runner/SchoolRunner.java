package com.xworkz.school.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.school.dto.SchoolDto;

public class SchoolRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			List<SchoolDto> list = new ArrayList();
			list.add(new SchoolDto("swetha", 23, "swetha@gmail.com", "9731276272"));
			list.add(new SchoolDto("swathi", 22, "swathi@gmail.com", "8105869581"));
			list.add(new SchoolDto("navya", 24, "navya@gmail.com", "9591868323"));
			list.add(new SchoolDto("ananya", 23, "ananya@gmail.com", "9974567945"));
			list.add(new SchoolDto("sanvi", 23, "sanvi@gmail.com", "9480420078"));

			for (SchoolDto dto : list) {
				SchoolDto schoolDto = new SchoolDto();
				schoolDto.setName(dto.getName());
				schoolDto.setAge(dto.getAge());
				schoolDto.setEmail(dto.getEmail());
				schoolDto.setPhoneNo(dto.getPhoneNo());

				em.persist(schoolDto);

			}

			et.commit();

		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}

}
