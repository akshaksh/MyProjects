package lambdaexpressions.methodreference;
interface Sayable{  
    void say();  
}  
public class StaticMethodReference {

	  public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	    public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = StaticMethodReference::saySomething;  
	        // Calling interface method  
	        sayable.say();
	      //  In the following example, we are using predefined functional interface Runnable to refer static method.
	        Thread t2=new Thread(StaticMethodReference::saySomething);  
	        t2.start();
	    }  

}
