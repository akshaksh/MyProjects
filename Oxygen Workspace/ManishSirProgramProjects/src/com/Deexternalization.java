package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deexternalization {

	public static void main(String... args) throws Exception, IOException{
		   
		   ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Ajay Kushwaha\\Desktop\\def.txt"));
		   ExternalizableExample u=(ExternalizableExample)in.readObject();
	       System.out.println("After  de externalizing user name: " +u.getName()+" and id is:"+u.getId());   
	   }
	
}
