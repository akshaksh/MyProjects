package com;

import java.io.Serializable;

public class Student implements Serializable{  
	 int id;  
	 String name;
	 static int number=30;
	 transient int y=60;
	 public Student(int id, String name) {  
		 System.out.println("ff");
		 y=80;
	  this.id = id;  
	  this.name = name;  
	 }  
	
	}  
