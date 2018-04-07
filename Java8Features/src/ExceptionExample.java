import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void display()throws IOException,SQLException{
		try{DriverManager.getConnection(""); 
		BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream("")));
		}
		catch(SQLException | IOException e){
			//e=new SQLException("Hello");
			throw e;
		}
	}
}
