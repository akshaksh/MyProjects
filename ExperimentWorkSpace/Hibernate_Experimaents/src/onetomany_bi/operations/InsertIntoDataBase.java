package onetomany_bi.operations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import onetomany_uni.entity.Course;
import onetomany_uni.entity.Review;
public class InsertIntoDataBase {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Course course=new Course();
			course.setId(2);
			course.setName("English");
			List<Review> lrev=new ArrayList<>();
			Review rev1=new Review();
			rev1.setId(5);
			rev1.setComments("This is good comment for id 5");
			lrev.add(rev1);
			
			rev1=new Review();
			rev1.setId(6);
			rev1.setComments("This is bad comment for id 5");
			lrev.add(rev1);
			
			rev1=new Review();
			rev1.setId(7);
			rev1.setComments("This is pathetic comment for id 5");
			lrev.add(rev1);
			course.setReviews(lrev);
			session.save(course);
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
