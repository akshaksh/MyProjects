package com.ajay.batch;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Tutorial {  
   private int tutorial_id; 
   private String tutorial_author; 
   private String tutorial_title;
   private String submission_date;  
 
 
   public int getTutorial_id() { 
      return tutorial_id; 
   }  
 
   public void setTutorial_id(int tutorial_id) { 
      this.tutorial_id = tutorial_id; 
   }  
 
 
   public String getTutorial_author() { 
      return tutorial_author; 
   }  
   public void setTutorial_author(String tutorial_author) { 
      this.tutorial_author = tutorial_author; 
   }  
      

   public String getTutorial_title() { 
      return tutorial_title; 
   }  
   
   public void setTutorial_title(String tutorial_title) { 
      this.tutorial_title = tutorial_title; 
   }  
   
 
   public String getSubmission_date() { 
      return submission_date; 
   }  
   
   public void setSubmission_date(String submission_date) { 
      this.submission_date = submission_date; 
   } 
   
   @Override 
   public String toString() { 
      return "  [Tutorial id=" + tutorial_id + ", tutorial_author="+tutorial_author+",tutorial_title="+tutorial_title+",submission Date="+submission_date + "]"; 
   } 
}  