package ejb.statelessbean;

import javax.naming.Context;
import javax.naming.InitialContext;

public class TestStatlessBeanClient {
	public static void main(String[] args)throws Exception {  
	    Context context=new InitialContext();  
	    CalculationImpl remote=(CalculationImpl)context.lookup("stl");  
	    System.out.println(remote.add(32,32));  
	}  
}
