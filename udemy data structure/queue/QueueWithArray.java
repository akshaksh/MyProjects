package com.queue;

public class QueueWithArray {
public static void main(String str[]) {
	QueueArray<String> qu=new QueueArray<>(10);
	qu.Queue("Ajay");
	qu.Queue("Ajay1");
	qu.Queue("Ajay2");
	qu.Queue("Ajay3");
	qu.Queue("Ajay4");
	qu.Queue("Ajay5");
	System.out.println(qu.Dequeue());
	System.out.println(qu.Dequeue());
	System.out.println(qu.Dequeue());
	System.out.println(qu.Dequeue());
	System.out.println(qu.Dequeue());
	System.out.println(qu.Dequeue());
	System.out.println(qu.Dequeue());
	
	
}
}
