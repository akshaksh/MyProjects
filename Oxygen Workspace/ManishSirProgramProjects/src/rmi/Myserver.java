package rmi;

import java.rmi.Naming;

public class Myserver {
	public static void main(String args[]){  
		try{  
		Calculation stub=new CalcualtionImpl();  
		Naming.rebind("rmi://localhost:5000/remoteobject",stub);  
		}catch(Exception e){System.out.println(e);}  
		} 
}
