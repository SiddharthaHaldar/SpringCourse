package com.luv2code.hibernate.demo;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateDemoOneToOne {

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Instructor.class)
									 .addAnnotatedClass(InstructorDetail.class)
									 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating object");
			Instructor i1 = new Instructor("sid2","haldar2","sidhaldar98@gmail.com");
			InstructorDetail id1 = new InstructorDetail("test1234","sidhaldar98@gmail.com");
			i1.setiD(id1);
			session.beginTransaction();
			session.save(i1);
			i1.setFirst_name("sid3");
			System.out.println("Saving instructor and related details");
			session.getTransaction().commit();
			
			System.out.println("Done");
		}
		finally {
			
		}
	}

}
