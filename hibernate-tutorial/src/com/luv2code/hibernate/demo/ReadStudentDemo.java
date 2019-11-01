package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				SessionFactory factory = new Configuration()
											 .configure("hibernate.cfg.xml")
											 .addAnnotatedClass(Student.class)
											 .buildSessionFactory();
				
				Session session = factory.getCurrentSession();
				
				try {
					System.out.println("Creating student object");
					Student tempStudent1 = new Student("test","Haldar","sidhaldar98@gmail.com");
					session.beginTransaction();
					System.out.println("Saving student");
					session.save(tempStudent1);
					session.getTransaction().commit();
					System.out.println("Done");
					
					System.out.println("Student id : "+tempStudent1.getId());
					session = factory.getCurrentSession();
					session.beginTransaction();
					Student myStudent = session.get(Student.class,tempStudent1.getId());
					System.out.println(myStudent);
				}
				finally {
					
				}
	}

}
