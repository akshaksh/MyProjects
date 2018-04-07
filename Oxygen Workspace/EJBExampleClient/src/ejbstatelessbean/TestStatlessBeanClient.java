package ejbstatelessbean;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
public class TestStatlessBeanClient {
	public static void main(String[] args)throws Exception {  
		Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
         InitialContext ctx = new InitialContext(props);
	    Calcualtion remote=(Calcualtion)ctx.lookup("ejb/statelessbean");  
	    System.out.println(remote.add(32,32));  
	}  
}
