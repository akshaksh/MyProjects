package com;

public class ExtendingStudentISA extends Student{
	String course="ABC";
	String sex="female";
	public ExtendingStudentISA(int id,String name){
		super(id,name);
		this.sex="male";
		this.course="DEF";
	}

}
