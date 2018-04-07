package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributesServlet2
 */
@WebServlet("/AttributesServlet2")
public class AttributesServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttributesServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.print("First Attribute httpsession:"+request.getSession().getAttribute("one")+"<br>");
			writer.print("Second Attribute httpsession:"+request.getSession().getAttribute("two")+"<br>");
			writer.print("Third Attribute httpsession:"+request.getSession().getAttribute("three")+"<br>");
			writer.print("First Attribute request:"+request.getAttribute("one")+"<br>");
			writer.print("Second Attribute request:"+request.getAttribute("two")+"<br>");
			writer.print("Third Attribute request:"+request.getAttribute("three")+"<br>");
			writer.print("First Attribute context:"+getServletContext().getAttribute("one")+"<br>");
			writer.print("Second Attribute context:"+getServletContext().getAttribute("two")+"<br>");
			writer.print("Third Attribute context:"+getServletContext().getAttribute("three")+"<br>");
	}
	

}
