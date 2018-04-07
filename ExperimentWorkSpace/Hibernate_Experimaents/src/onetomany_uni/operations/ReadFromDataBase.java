package onetomany_uni.operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import onetomany_uni.entity.Course;
import onetomany_uni.entity.Review;
public class ReadFromDataBase {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Course course=session.get(Course.class,1);
			System.out.println("coursename: "+course.getName());
			List<Review> reviews = course.getReviews();
			for(int i=0;i<reviews.size();i++) {
				System.out.println(reviews.get(i));
			}
			
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
