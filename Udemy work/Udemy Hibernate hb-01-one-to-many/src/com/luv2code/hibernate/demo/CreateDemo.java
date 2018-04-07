package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
public class CreateDemo {

	public static void main(String[] args) {
		//I was facing some issue for auto generation of id so i removed it 
		//I will check that later point so as of now using mysql
		
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
					Instructor ins=new Instructor();
					ins.setFirstName("Ajay");
					ins.setLastName("Kushwaha");
					ins.setEmail("kjdsfskjdfb@gmail.com");
					InstructorDetail insdtl=new InstructorDetail();
					insdtl.setHobby("Watching");
					insdtl.setYoutubeChannel("fskjfsbdfsd");
					ins.setInstructor_detail_id(insdtl);
					session.getTransaction().commit();
					System.out.println("Record Insertion done !!!!");
				}
				catch(Exception e){
					System.out.println("Exception :"+e);
				}
				finally{
					//Close the session to save from any leakage on exception
					session.close();
					factory.close();
				}
				

	}

}
