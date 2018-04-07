package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializingExample {
	public static void main(String args[])throws Exception{  
	    
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\Ajay Kushwaha\\\\Desktop\\\\abc.txt"));  
		  //ExtendingStudentISA s=(ExtendingStudentISA)in.readObject();
		  ExtendingStudentHASA s=(ExtendingStudentHASA)in.readObject();
		  //System.out.println(s.id+" "+s.name+" "+s.number+"   "+s.y+" "+s.course+" "+s.sex);
		  System.out.println(s.student.id+" "+s.student.name+" "+s.student.number+"   "+s.student.y+" "+s.address);
		  in.close();
		 }  

}
