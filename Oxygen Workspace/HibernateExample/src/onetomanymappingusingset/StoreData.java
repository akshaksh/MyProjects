package onetomanymappingusingset;

import java.util.HashSet;
import org.hibernate.*;  
import org.hibernate.cfg.*;  
/*Only for one time insertion it is working*/  
public class StoreData {  
public static void main(String[] args) {  
    Session session=new Configuration().configure("hibernate.cfg.xml")  
                            .buildSessionFactory().openSession();  
    Transaction t=session.beginTransaction();  
      
    Answer ans1=new Answer();  
    ans1.setAnswer("java is a programming language");  
    ans1.setPostedBy("Ravi Malik");  
      
    Answer ans2=new Answer();  
    ans2.setAnswer("java is a platform");  
    ans2.setPostedBy("Sudhir Kumar");  
      
    Answer ans3=new Answer();  
    ans3.setAnswer("Servlet is an Interface");  
    ans3.setPostedBy("Jai Kumar");  
      
    Answer ans4=new Answer();  
    ans4.setAnswer("Servlet is an API");  
    ans4.setPostedBy("Arun");
      
    HashSet<Answer> list1=new HashSet<Answer>();  
    list1.add(ans1);  
    list1.add(ans2);  
      
    HashSet<Answer> list2=new HashSet<Answer>();  
    list2.add(ans3);  
    list2.add(ans4);  
      
    Question question1=new Question();  
    question1.setQname("What is Java?");  
    question1.setAnswers(list1);  
      
    Question question2=new Question();  
    question2.setQname("What is Servlet?");  
    question2.setAnswers(list2);  
      
    session.save(question1);  
    session.save(question2);
    t.commit();  
    session.close();  
    System.out.println("success");  
}  
}  