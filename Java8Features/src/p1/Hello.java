package p1;
class Parent{
	void show(){System.out.println("Parent Show");}
}
public class Hello extends Parent{
	{System.out.println("Static 2");}
	{System.out.println("Static 3");}
	void show(){System.out.println("Child Show");}
	void display(){System.out.println("Display");}
	public static void main(String args[]){
		byte a=7;
		a=(byte)(a+8);
		
	}
}

