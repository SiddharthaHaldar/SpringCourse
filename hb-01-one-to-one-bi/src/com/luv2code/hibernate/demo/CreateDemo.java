package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(Student.class)
									 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating student object");
			Student tempStudent1 = new Student("Sid7","Haldar","sidhaldar98@gmail.com");
			Student tempStudent2 = new Student("Sid8","Haldar","sidhaldar98@gmail.com");
			Student tempStudent3 = new Student("Sid9","Haldar","sidhaldar98@gmail.com");
			session.beginTransaction();
			System.out.println("Saving student");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			
		}
	}

}
