package onetomany_bi.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany_bi.entity.Course;
import onetomany_bi.entity.Review;
public class ReadFromDataBase {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Review review=session.get(Review.class, 6);
			Course course=review.getCourse();
			System.out.println(course.toString());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
