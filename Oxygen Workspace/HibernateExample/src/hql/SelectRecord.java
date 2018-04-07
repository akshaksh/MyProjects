package hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class SelectRecord {
	public static void main(String str[]) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		//Transaction txn=session.beginTransaction();
		Query query=session.createQuery("from Employeerecords where id>=:row_id");
		query.setInteger("row_id",1);
		List<Employeerecords> list = query.list();
		Iterator<Employeerecords> i=list.iterator();
		while(i.hasNext())
		{
			Employeerecords  emprec=i.next();
			System.out.print(emprec.getId()+",");
			System.out.print(emprec.getName()+",");
			System.out.print(emprec.getEmail()+",");
			System.out.println(emprec.getPhonenumber());
		}
		//txn.commit();
		session.close();
		
	}
}
