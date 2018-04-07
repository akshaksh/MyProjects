package hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;

public class Criteriaexamples {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		/*
		 * Select Query with Criteria for all records
		Criteria crit=session.createCriteria(Employeerecords.class);
		List<Employeerecords> list = crit.list();
		Iterator<Employeerecords> i=list.iterator();
		while(i.hasNext())
		{
			Employeerecords  emprec=i.next();
			System.out.print(emprec.getId()+",");
			System.out.print(emprec.getName()+",");
			System.out.print(emprec.getEmail()+",");
			System.out.println(emprec.getPhonenumber());
		}
		*/
		
		Criteria crit=session.createCriteria(Employeerecords.class);
		crit.add(Restrictions.eq("id", 1));
		List<Employeerecords> list = crit.list();
		Iterator<Employeerecords> i=list.iterator();
		while(i.hasNext())
		{
			Employeerecords  emprec=i.next();
			System.out.print(emprec.getId()+",");
			System.out.print(emprec.getName()+",");
			System.out.print(emprec.getEmail()+",");
			System.out.println(emprec.getPhonenumber());
		}
		session.close();
		
	}

}
