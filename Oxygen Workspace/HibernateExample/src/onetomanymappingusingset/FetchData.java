package onetomanymappingusingset;
import java.util.*;  
import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class FetchData {  
public static void main(String[] args) {  
      
    Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
      
    Query query=session.createQuery("from Question");  
    List<Question> list=query.list();  
    Iterator<Question> itr=list.iterator();  
    while(itr.hasNext()){  
        Question q=itr.next();  
        System.out.println("Question Name: "+q.getQname());  
          
        //printing answers  
        Set<Answer> list2=q.getAnswers();  
        Iterator<Answer> itr2=list2.iterator();  
        while(itr2.hasNext()){  
            System.out.println((itr2.next()).getAnswer());  
        }  
          
    }  
    session.close();  
    System.out.println("success");  
}  
}  