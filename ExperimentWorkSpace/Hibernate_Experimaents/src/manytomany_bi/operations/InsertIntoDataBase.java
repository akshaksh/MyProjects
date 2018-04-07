package manytomany_bi.operations;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany_bi.entity.Course;
import manytomany_bi.entity.Student;

public class InsertIntoDataBase {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
			Course course=new Course();
			course.setId(2);
			course.setName("English");
			Student stud1=new Student();
			stud1.setId(3);stud1.setFirstName("Ajay");stud1.setLastName("Kuswhaha");stud1.setEmail("a@a.com");
			Student stud2=new Student();
			stud2.setId(4);stud2.setFirstName("Ajay1");stud2.setLastName("Kuswhaha1");stud2.setEmail("b@b.com");
			List<Student> studlist=new ArrayList<>();
			studlist.add(stud1);studlist.add(stud2);
			course.setStudents(studlist);
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
