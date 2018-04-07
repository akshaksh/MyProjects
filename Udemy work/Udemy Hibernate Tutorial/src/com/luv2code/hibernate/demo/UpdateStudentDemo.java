package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		//create session factory 
				SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

				//create Session
				Session session=factory.getCurrentSession();
				try{
					session.beginTransaction();
					Student student=session.get(Student.class,1);
					student.setFirstName("Rohan");
					student.setEmail("ajay@gmail.com");
					session.getTransaction().commit();
				}
				catch(Exception e){
					System.out.println("Exception :"+e);
				}
				finally{
					factory.close();
				}

	}

}
