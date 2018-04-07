package annotation;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.objectweb.asm.attrs.Annotation;

public class StoreData {

public static void main(String[] args) {  
        
    //creating session object  
	//It will automatically pick the hibernate.cfg.xml file
    Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession(); 
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(4);  
    e1.setFirstName("Rana");  
    e1.setLastName("Naved");  
    System.out.println(session.save(e1));//persisting the object
    t.commit();//transaction is commited  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}
