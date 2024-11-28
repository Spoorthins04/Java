package com.xworkz.school.operation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.school.dto.SchoolDto;

public class SchoolUpdate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();

			SchoolDto schoolDto = new SchoolDto();
			int value = em.createQuery(
					"update SchoolDto table set table.name=:setname ,table.email=:setemail where table.phoneNo=:setphoneNo")
					.setParameter("setname", "swetha jv").setParameter("setemail", "swathi@gmail.com")
					.setParameter("setphoneNo", "9731276272").executeUpdate();

			if (value > 0)
				System.out.println("updated");

			else
				System.err.println("error");

			
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

