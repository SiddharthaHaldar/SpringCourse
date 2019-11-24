package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteDemoOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Instructor.class)
									 .addAnnotatedClass(InstructorDetail.class)
									 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Deleting object");
			int id =  1;
			session.beginTransaction();
			Instructor i1 = session.get(Instructor.class, id);
			session.delete(i1);
			System.out.println("Deleting instructor and related details");
			
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			
		}
	}

}
