package com.xworkz.cloth.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.xworkz.cloth.entity.ClothEntity;

@Repository
public class ClothRepositoryImp implements ClothRepository {

	public boolean save(ClothEntity clothEntity) {
		System.out.println("clothEntity in repo:" + clothEntity);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.persist(clothEntity);
			et.commit();
		} catch (Exception e) {
			if (et.isActive())
				et.rollback();
		} finally {
			em.close();
			emf.close();
		}

		return false;
	}

}