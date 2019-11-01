package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				SessionFactory factory = new Configuration()
						 .configure("hibernate.cfg.xml")
						 .addAnnotatedClass(Student.class)
						 .buildSessionFactory();

				Session session = factory.getCurrentSession();
				int studentId = 1;
				try {
				session.beginTransaction();
				Student myStudent = session.get(Student.class,studentId);
				myStudent.setFirstName("Sid");
				session.getTransaction().commit();
				System.out.println("Updated");
				
				session = factory.getCurrentSession();
				session.beginTransaction();
				session
			    .createQuery("update Student set email = 'test@gmail.com'")
 			    .executeUpdate();
				
				session.getTransaction().commit();
				System.out.println("Done");
				}
				finally {
				
				}
	}

	private static void displayUpdatedStudents(List<Student> st) {
		for(Student s:st)
			System.out.println(s);
	}

}
