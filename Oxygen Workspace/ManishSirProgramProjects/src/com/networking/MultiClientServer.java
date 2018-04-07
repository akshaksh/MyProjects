package com.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//This server can take more than one connection
public class MultiClientServer {
	//Use Array List if and only if we want to send all the data to all the connections
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	public MultiClientServer() throws IOException {
		ss=new ServerSocket(10);
		while(true) {
			s=ss.accept();
			System.out.println("New Client Connected");
			Mythread t1=new Mythread(s);
			t1.start();
		}
	}
	public static void main(String strs[]) throws IOException {
		new MultiClientServer();
	}
}
class Mythread extends Thread{
	Socket s;
	String st="";
	public Mythread(Socket s) {
		this.s=s;
	}
	public void run() {
		while(true) {
			try {
			DataInputStream dis=new DataInputStream(s.getInputStream());
				st=dis.readUTF();
			System.out.println("st:"+st);
			if(st.equals("stop"))break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}