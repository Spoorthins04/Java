package com.xworkz.school.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.school.dto.SchoolDto;

public class SchoolRead {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			SchoolDto schoolDto = new SchoolDto();

			List<SchoolDto> list = em.createQuery("select a from SchoolDto a", SchoolDto.class).getResultList();

			for (SchoolDto schoolDto2 : list) {
				System.out.println(schoolDto2);

			}

			System.out.println("=================================");
			List<SchoolDto> list2 = em
					.createQuery("SELECT new SchoolDto(u.name , u.phoneNo) FROM SchoolDto u WHERE u.age > 15",
							SchoolDto.class)
					.getResultList();
			for (SchoolDto schoolDto2 : list2) {
				System.out.println("name = " + schoolDto2.getName() + " phoneNo = " + schoolDto2.getPhoneNo());
			}

			System.out.println("=================================");
			List<String> list3 = em
					.createQuery(
							"select u.email from SchoolDto u where u.name like : setname OR u.name like :setname1 ")
					.setParameter("setname", "s%").setParameter("setname1", "%n").getResultList();
			for (String string : list3) {
				System.out.println(string);
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
