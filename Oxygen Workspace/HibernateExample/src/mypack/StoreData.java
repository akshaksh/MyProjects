package mypack;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(4);  
    e1.setFirstName("Rana");  
    e1.setLastName("Naved");  
    //Query query=session.createSQLQuery("insert into emp values("+e1.getId()+",'"+e1.getFirstName()+"','"+e1.getLastName()+"')");
    //createSQLQuery method used for direct SQL query like JDBC
   // System.out.println(session.save(e1));//persisting the object
   // session.saveOrUpdate(e1);
    //query.executeUpdate();
    t.commit();//transaction is commited  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}
