package manytomany_bi.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany_bi.entity.Course;
import manytomany_bi.entity.Student;
public class ReadFromDataBase {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Course course=session.get(Course.class,1);
			System.out.println("course"+course);
			System.out.println("course has students: "+course.getStudents());
			
			Student stud=session.get(Student.class,4);
			System.out.println("Student"+stud);
			System.out.println("student has courses: "+stud.getCourses());
			
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
