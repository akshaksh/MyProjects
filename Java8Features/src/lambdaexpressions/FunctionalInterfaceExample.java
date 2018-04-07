package lambdaexpressions;
/*A functional interface is an interface which has only one abstract method 
and this program will tell use that with and without difference of lambda expression*/

//With Lambda Expression
@FunctionalInterface //it is optional
interface my{void show();}
public class FunctionalInterfaceExample{
	public static void main(String str[]){
		my ob=()->{System.out.println("Hello");};//We can pass zero or many arguments
		//my ob=(name)->{return "Hello"+name;} //if parameter is there
		//my ob=name->{return "Hello"+name;} //if parameter is there then we can omit() also
		ob.show();
	}
}

/*Without lambda expression
interface my{void show();}
public class FunctionalInterfaceExample implements my{
	
	public static void main(String[] args) {
		new FunctionalInterfaceExample().show();
	}
	@Override
	public void show() {
	System.out.println("Hello");
		
	}

}
*/