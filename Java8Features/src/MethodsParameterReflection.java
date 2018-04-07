import java.lang.reflect.Method;  
import java.lang.reflect.Parameter;  
public class MethodsParameterReflection {

	public static void main(String[] args) {
		 
        // Creating object of a class   
        Calculate calculate = new Calculate();  
        // instantiating Class class  
        Class cls = calculate.getClass();  
        // Getting declared methods inside the Calculate class  
        Method[] method = cls.getDeclaredMethods(); // It returns array of methods  
        // Iterating method array  
        for (Method method2 : method) {  
            System.out.print(method2.getName());    // getting name of method  
            // Getting parameters of each method  
            Parameter parameter[] = method2.getParameters(); // It returns array of parameters  
            // Iterating parameter array  
            for (Parameter parameter2 : parameter) {  
                System.out.print(""+parameter2.getParameterizedType()); // returns type of parameter  
                System.out.print(""+parameter2.getName()); // returns parameter name  
            }  
            //if we will not compile this class with -parmeters then it will give parameters name as arg0 arg1
            //If we compile with -parameters then it will give proper name of param
            System.out.println();  
        }  

	}

}
class Calculate {  
    int add(int a, int b){  
        return (a+b);  
    }  
    int mul(int a, int b){  
        return (b*a);  
    }  
}  
