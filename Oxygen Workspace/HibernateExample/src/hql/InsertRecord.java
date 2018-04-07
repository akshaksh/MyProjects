package hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class InsertRecord {
public static void main(String str[]) {
	AnnotationConfiguration cfg=new AnnotationConfiguration();
	Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Transaction txn=session.beginTransaction();
	Query query=session.createQuery("insert into Employeerecords(id,name,email,phonenumber)"+"select id,name,email,phonenumber from Oldemployeerecords where id>:row_id");
	query.setInteger("row_id",1);
	int modification=query.executeUpdate();
	txn.commit();
	session.close();
	System.out.println("Number of records update: "+modification);
	
}
}
