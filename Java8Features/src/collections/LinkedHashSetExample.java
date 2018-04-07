package collections;

import java.util.concurrent.atomic.AtomicInteger;

public class LinkedHashSetExample {

	public static void main(String[] args)throws Exception {
			Counter cnt=new Counter();
			A t1=new A(cnt);
			B t2=new B(cnt);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		}
}
class Counter{
	private AtomicInteger counter=new AtomicInteger();

	public int getCounter() {
		return counter.incrementAndGet();
	}
   public void increment(){
	   counter.getAndIncrement();
   }
}
class A extends Thread{
	Counter counterclass;
	public A(Counter counterclass) {
		this.counterclass = counterclass;
	}

	public void run(){
		for(int i=0;i<1000;i++)
		{
			counterclass.increment();
			System.out.println("Thread-1 :"+counterclass.getCounter());
		}
	}
}

class B extends Thread{
	Counter counterclass;
	public B(Counter counterclass) {
		this.counterclass = counterclass;
	}

	public void run(){
		for(int i=0;i<1000;i++)
		{
			counterclass.increment();
			System.out.println("Thread-2 :"+counterclass.getCounter());
		}
	}
}