package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample{
	public static void main(String args[])throws Exception{  
		//ExtendingStudentISA s1 =new ExtendingStudentISA(213,"Ajay");  
		  Student st =new Student(213,"Ajay");
		  ExtendingStudentHASA s1 =new ExtendingStudentHASA(st);
		  FileOutputStream fout=new FileOutputStream("C:\\Users\\Ajay Kushwaha\\Desktop\\abc.txt");  
		  ObjectOutputStream outs=new ObjectOutputStream(fout);  
		  outs.writeObject(s1);  
		  outs.flush();  
		  System.out.println("success");  
		 }  
}
