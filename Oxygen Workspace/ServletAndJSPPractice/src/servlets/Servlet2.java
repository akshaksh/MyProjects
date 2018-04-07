package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException {
	
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		//String data=(String) req.getParameter("name");
		String data=(String) req.getAttribute("name");
		out.println("<html><body>Servlet2"+data+"<body></html>");
	}
}
