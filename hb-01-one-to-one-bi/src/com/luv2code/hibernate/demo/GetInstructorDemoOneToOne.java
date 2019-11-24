package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class GetInstructorDemoOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Instructor.class)
									 .addAnnotatedClass(InstructorDetail.class)
									 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			//System.out.println("Deleting object");
			int id =  2;
			session.beginTransaction();
			InstructorDetail id1 = session.get(InstructorDetail.class, id);
			Instructor i1 = id1.getInstructor();
			System.out.println("Instructor Detail : "+id1);
			System.out.println("Detail : "+i1);
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			
		}
	}

}
