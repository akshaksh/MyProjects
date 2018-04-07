package com;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExternalizationTest {
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		ExternalizableExample test=new ExternalizableExample("Ajay",12,"Kushwahas");
		FileOutputStream fis = new FileOutputStream("C:\\Users\\Ajay Kushwaha\\Desktop\\def.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fis);
		ois.writeObject(test);
		fis.close();
		ois.close();
		System.out.println("Done Changes");
	}

}
