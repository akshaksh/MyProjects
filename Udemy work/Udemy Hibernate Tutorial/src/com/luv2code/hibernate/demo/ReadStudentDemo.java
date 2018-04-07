package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		//create session factory 
				SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

				//create Session
				Session session=factory.getCurrentSession();
				try{
					session.beginTransaction();
					Student student=session.get(Student.class,6);//We need default public constructor otherwise it will give error 
					System.out.println("Retrive Object Info :");
					System.out.println("firstname :"+student.getFirstName());
					System.out.println("firstname :"+student.getLastName());
					System.out.println("firstname :"+student.getEmail());
				}
				catch(Exception e){
					System.out.println("Exception :"+e);
				}
				finally{
					factory.close();
				}

	}

}
