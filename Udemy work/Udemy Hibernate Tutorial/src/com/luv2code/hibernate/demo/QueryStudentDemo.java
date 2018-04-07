package com.luv2code.hibernate.demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		//create session factory 
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

		//create Session
		Session session=factory.getCurrentSession();
		
		try{
			session.beginTransaction();
			List list=session.createQuery("from Student").getResultList();
			Iterator iterator=list.iterator();
			while(iterator.hasNext()){
				Student stud=(Student)iterator.next();
				System.out.println("firstname: "+stud.getFirstName());
				System.out.println("laststname: "+stud.getLastName());
				System.out.println("email: "+stud.getEmail());
			}
		}
		catch(Exception e){
			System.out.println("Exception :"+e);
		}
		finally{
			factory.close();
		}
	}

}
