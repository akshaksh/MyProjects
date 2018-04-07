package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
public class CreateCourseDemo {

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
					//Below tasks will perform
					//Get the instructor from db
					Instructor ins=session.get(Instructor.class, 2);
					
					//Create some Course
					Course c1=new Course();
					c1.setTitle("Science");
					Course c2=new Course();
					c2.setTitle("Hindi");
					Course c3=new Course();
					c3.setTitle("English");
					//add courses to the instructor and save it
					ins.add(c1);
					ins.add(c2);
					ins.add(c3);
					
					//Saving
					session.save(c1);
					session.save(c2);
					session.save(c3);
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
