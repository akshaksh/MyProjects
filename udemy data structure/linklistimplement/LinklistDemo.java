//For Stack with Link list is same as below link list
package com.linklistimplement;

public class LinklistDemo {

	public static void main(String[] args) {
		LinkList<String> ls=new LinkList<String>();
		ls.add("Ajay");
		ls.add("Ajay1");
		ls.add("Ajay2");
		ls.add("Ajay3");
		ls.add("Ajay4");
		ls.display();
		System.out.println("After Delete");
		ls.delete();
		ls.display();
	}

}
