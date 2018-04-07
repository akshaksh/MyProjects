package onetomany_bi.operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import onetomany_uni.entity.Course;
import onetomany_uni.entity.Review;
public class UpdateIntoDataBase {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Course course=session.get(Course.class,2);
			course.setName("Physics");
			session.update(course);
			session.getTransaction().commit();
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
