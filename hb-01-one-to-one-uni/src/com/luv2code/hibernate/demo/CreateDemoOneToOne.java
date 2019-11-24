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
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Instructor.class);
		configuration.addAnnotatedClass(InstructorDetail.class);
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		Session session2 = factory.openSession();
		
		try {
//			System.out.println("Creating object");
//			Instructor i1 = new Instructor("sid2","haldar4","sidhaldar98@gmail.com");
//			InstructorDetail id1 = new InstructorDetail("test6789","sidhaldar98@gmail.com");
//			i1.setiD(id1);
//			session.beginTransaction();
//			session.save(i1);
//			i1.setFirst_name("sid4");
//			System.out.println("Saving instructor and related details");
//			session.getTransaction().commit();
//			session.close();
//			i1.setFirst_name("sid5");
//			session2.beginTransaction();
//			session2.update(i1);
//			session2.getTransaction().commit();
//			System.out.println("Done");
			session.beginTransaction();
			InstructorDetail id = session.load(InstructorDetail.class,4);
			Instructor i = new Instructor("sid7","haldar7","sidhaldar98@gmail.com");//session.get(Instructor.class,2);
		    i.setiD(id);
			session.save(i);
			session.evict(i);
			i.setFirst_name("sid10");
			//id.setHobby("Swimmin'");
			session.saveOrUpdate(i);
			//session.saveOrUpdate(id);
		    //i.setiD(id);
			session.getTransaction().commit();
			session.close();
		}
		finally {
			
		}
	}

}
