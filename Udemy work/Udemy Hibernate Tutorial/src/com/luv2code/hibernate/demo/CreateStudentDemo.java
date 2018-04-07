package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
	
		//create session factory 
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

		//create Session
		Session session=factory.getCurrentSession();
		
		try{
			//Create student object
			System.out.println("Creating New Student Object...");
			Student stud=new Student("Rajesh", "Kumar", "abc@gmail.com");
			
			//Start the transaction
			System.out.println("Starting New Transcation...");
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving Student Object...");
			session.save(stud);
			
			//commit the transaction
			System.out.println("Commit the transaction...");
			session.getTransaction().commit();
			
			System.out.println("Done !!!!");
		}
		catch(Exception e){
			
		}
		finally{
			factory.close();
		}
	}

}
