package rmi;

import java.rmi.Naming;

public class Myclient {
	public static void main(String strs[]) {
	try{  
		Calculation stub=(Calculation)Naming.lookup("rmi://localhost:5000/remoteobject");  
		System.out.println(stub.add(34,4));  
		}catch(Exception e){
		} 
	}
}
