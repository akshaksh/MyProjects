package com.networking;
import java.net.InetAddress;
import java.net.UnknownHostException;
//To Get the name of the IP from the name of the web site
public class GetIP {
	public static void main(String[] args) {
	      InetAddress address = null;
	      try {
	         address = InetAddress.getByName("www.google.com");
	      } catch (UnknownHostException e) {
	         System.exit(2);
	      }
	      System.out.println(address.getHostName() + "=" + address.getHostAddress());
	      System.exit(0);
	   }
}
