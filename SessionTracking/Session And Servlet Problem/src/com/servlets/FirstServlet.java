package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try{  
			  
			    response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			          
			    String firstName=request.getParameter("firstName");  
			    String lastName=request.getParameter("lastName");
			    out.print("Welcome "+firstName+lastName);  
			  
			    Cookie ck=new Cookie("firstName",firstName);//creating cookie object
			    Cookie ck1=new Cookie("lastName",lastName);//creating cookie object
			    response.addCookie(ck);//adding cookie in the response  
			    response.addCookie(ck1);//adding cookie in the response
			  
			    //creating submit button  
			    out.print("<form action='SecondServlet'>");  
			    out.print("<input type='submit' value='go'>");  
			    out.print("</form>");  
			          
			    out.close();  
			  
			        }catch(Exception e){System.out.println(e);}  
	}

}
