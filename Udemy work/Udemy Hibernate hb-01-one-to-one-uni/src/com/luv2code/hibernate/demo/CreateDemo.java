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
					Instructor instructor=new Instructor();
					instructor.setFirstName("Ajay");
					instructor.setLastName("Kushwaha");
					instructor.setEmail("kfjsfjgsd@gmail.com");
					InstructorDetail instdtl=new InstructorDetail();
					instdtl.setHobby("Cricket");
					instdtl.setYoutubeChannel("BB ki vines");
					instructor.setInstructor_detail_id(instdtl);
					//Here it will save detail object also as it has cascade ALL
					//so here both object save;
					session.save(instructor);
					
					/*For Deletion
					Instructor tempinst=session.get(Instructor.class,101);
					if(tempinst != null)
					session.delete(tempinst);
					*/
					
					session.getTransaction().commit();
					System.out.println("Record successfully created !!!!!!");
				}
				catch(Exception e){
					System.out.println("Exception :"+e);
				}
				finally{
					factory.close();
				}
				

	}

}
