package com.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private DataInputStream dis;
	private DataOutputStream dos;
	ServerSocket ss;
	Socket s;
	public EchoServer() throws IOException {
		ss=new ServerSocket(10);
		s=ss.accept();
		dis=new DataInputStream(s.getInputStream());
		System.out.println("SocketConnected");
		serverChat();
	}
	public void serverChat() throws IOException{
		String str="jk",s1;
		do {
			str=dis.readUTF();
			System.out.println("Client Message::  "+str);
		}while(!str.equals("stop"));
	}
	public static void main(String strs[]) throws IOException {
		new EchoServer();
	}
}
