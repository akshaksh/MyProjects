package ejbstatelessbean;
import java.io.IOException;
import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import ejbStateful.*;
@WebServlet("/OpenAccount")  
public class OpenAccount extends HttpServlet {  
    //@EJB(mappedName="stateful123")  
    //BankRemote b;  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
                throws ServletException, IOException {  
        try{  
        	Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
             InitialContext ctx = new InitialContext(props);  
            Bank b=(Bank)ctx.lookup("Stateful");  
              
            request.getSession().setAttribute("remote",b);  
            request.getRequestDispatcher("/operation.jsp").forward(request, response);  
          
        }catch(Exception e){System.out.println(e);}  
    }  
}  