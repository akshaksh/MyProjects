package inheritance;

class A{
	static void show() {System.out.println("Parent");}
}
public class StaticClassInheritanceExample extends A{
	static void show() {System.out.println("Child");}
	public static void main(String strs[]) {
		StaticClassInheritanceExample.show();
	}
	
}
