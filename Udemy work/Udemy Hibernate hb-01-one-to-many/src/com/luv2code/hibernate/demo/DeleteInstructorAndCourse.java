package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteInstructorAndCourse {

	public static void main(String[] args) {
		//create session factory 
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();

		//create Session
		Session session=factory.getCurrentSession();
		try{
			session.beginTransaction();
			Instructor crs=session.get(Instructor.class, 2);
			session.delete(crs);
			session.getTransaction().commit();
			System.out.println("Deletion Done !!!!!");
		}
		catch(Exception e){
			System.out.println("Exception :"+e);
		}
		finally{
			session.close();
			factory.close();
		}

	}

}
