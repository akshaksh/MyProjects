package com.networking;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private Socket s;
	private DataInputStream dis;
	private DataOutputStream dos;
	public EchoClient() throws UnknownHostException, IOException {
		s=new Socket("localhost",10);
		dos=new DataOutputStream(s.getOutputStream());
		clientChat();
	}
	public void clientChat() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		while(true){
					str=br.readLine();
					if(str.equals("stop")) {
						dos.writeUTF(str);
						break;
					}
					dos.writeUTF(str);
					dos.flush();
				}
	}
	public static void main(String strs[]) throws UnknownHostException, IOException {
		new EchoClient();
	}

}
