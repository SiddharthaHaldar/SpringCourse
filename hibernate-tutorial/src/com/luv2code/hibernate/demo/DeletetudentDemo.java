package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeletetudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				SessionFactory factory = new Configuration()
											 .configure("hibernate.cfg.xml")
											 .addAnnotatedClass(Student.class)
											 .buildSessionFactory();
				
				Session session = factory.getCurrentSession();
				
				try {
					
					session.beginTransaction();
					session
					.createQuery("delete from Student where id = 1")
					.executeUpdate();
					session.getTransaction().commit();
					System.out.println("Done");
					
				}
				finally {
					
				}
	}

}
