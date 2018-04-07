package com.servlets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetriveImage
 */
@WebServlet("/RetriveImage")
public class RetriveImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetriveImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream(); //For IO reading stream based
		//PrintWriter writer = response.getWriter();//For Character based Reading
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","SYSTEM_1");  
			PreparedStatement ps=con.prepareStatement("select * from imgtable");  
			ResultSet rs=ps.executeQuery();
			if(rs.next()){//now on 1st row  
				Blob b=rs.getBlob(2);//2 means 2nd column data
				InputStream binaryStream = b.getBinaryStream();
				BufferedInputStream br=new BufferedInputStream(binaryStream);
				BufferedOutputStream bout=new BufferedOutputStream(out);
				int ch=0;
				while((ch=br.read()) != -1){
					bout.write(ch);
				}
				bout.close();
				br.close();
				binaryStream.close();
				out.flush();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		//writer.close();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}


/*To read directly 
 * FileInputStream fin=new FileInputStream("C:\\Users\\Ajay_Kushwaha\\Desktop\\img.jpg");
BufferedInputStream bin = new BufferedInputStream(fin);  
BufferedOutputStream bout = new BufferedOutputStream(out);  
int ch =0; ;  
while((ch=bin.read())!=-1)  
{  
bout.write(ch);  
}  
  
bin.close();  
fin.close();  
bout.close();  
out.close();*/