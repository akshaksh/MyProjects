package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
public class CreateDemo {

	public static void main(String[] args) {
		//I was facing some issue for auto generation of id so i removed it 
		//I will check that later point so as of now using mysql
		
		//create session factory 
				SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

				//create Session
				Session session=factory.getCurrentSession();
				try{
					session.beginTransaction();
					//Read Operation from instructor_detail to instructor
					InstructorDetail instdtl=session.get(InstructorDetail.class, 2);
					Instructor ins=instdtl.getInstructor();
					System.out.println("Deleting the Instructor Detail and Instructor");
					
					//Delete Operation from instructor_detail to instructor
					//session.delete(instdtl);
					
					/*
					 *Delete only child means instructor_detail not instructor
					 *a)For this we need to remove the link from Parent to child 
					 *means from instructor's instructor_detail property
					 *b)And need to change the cascade type from all to manual selection
					 *of all values except remove
					 */
					ins.setInstructor_detail_id(null);
					session.delete(instdtl);
					session.getTransaction().commit();
					System.out.println("Deletion done !!!!");
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
