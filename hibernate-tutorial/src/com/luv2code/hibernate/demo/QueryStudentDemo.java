package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(Student.class)
				 .buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
		session.beginTransaction();
		List<Student> students = session
								.createQuery("from Student s where"+
											" s.firstName ='test' OR"+
											" s.lastName = 'haldar'")
								.getResultList();
		displayStudents(students);
		session.getTransaction().commit();
		}
		finally {
		
		}
	}

	private static void displayStudents(List<Student> students) {
		for(Student st:students)
			System.out.println(st);
	}

}
