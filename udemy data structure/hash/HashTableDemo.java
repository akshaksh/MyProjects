package com.hash;

public class HashTableDemo {
	
	public static void main(String str[]) {
		HashTableArray<String> ht=new HashTableArray<>(10);
		ht.put(2,"Ajay");
		ht.put(3,"Ajay1");
		ht.put(4,"Ajay2");
		ht.put(5,"Ajay3");
		ht.put(6,"Ajay4");
		ht.put(7,"Ajay5");
		ht.put(8,"Ajay6");
		
		System.out.println(ht.get(2));
		
		
	}
	
}
