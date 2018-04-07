package hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class Aggregatorfunctions {
	public static void main(String str[]) {
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	//Query query=session.createQuery("select count(*)from Employeerecords");
	//Query query=session.createQuery("select sum(id)from Employeerecords");
	//Query query=session.createQuery("select max(id)from Employeerecords");

	//Named Query annotation example it works with @Entity only
	Query query=session.getNamedQuery("count");
	System.out.println(query.list().get(0));
	session.close();
	}
}
