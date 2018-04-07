package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException {
	
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String data=getServletConfig().getInitParameter("age");
		out.println("<html><body>Servlet1"+data+",  "+getServletContext().getInitParameter("con")+"<body></html>");	
		req.setAttribute("name", "Rakeshsdkf");
		req.getRequestDispatcher("Servlet2").include(req, resp);
		//req.getRequestDispatcher("Servlet2").forward(req, resp);
		//resp.sendRedirect("Servlet2?name=Ajay");
		//Through sendRedirect we can send only parameters not any attributes
		
		
	}
}
