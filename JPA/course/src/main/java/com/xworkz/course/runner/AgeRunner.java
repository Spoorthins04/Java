package com.xworkz.course.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.course.dto.CourseDTO;

public class AgeRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		if(emf!=null)
		{
			System.out.println("connected");
		}
		
		
//		 where cd.age>15
		
		try
		{
			et.begin();
		 List<CourseDTO> list1 = entityManager.createQuery("select cd from CourseDTO cd where cd.age>15",CourseDTO.class).getResultList();
		 
		 System.out.println("list "+list1.size());
		 for(CourseDTO dto:list1)
		 {
			 System.out.println("name:"+dto.getName()+" "+"phone:"+dto.getPhone());
		 }
			
			
			 

		 

		et.commit();
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally
		{
			emf.close();
			entityManager.close();
		}

	}

}