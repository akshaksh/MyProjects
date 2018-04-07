package com.queue.java;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {

	public static void main(String[] args) {
		//Queue implement using LinkedList in Java
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		System.out.println(q.poll());
		
		//PriorityQueue implement using PriorityQueue and Priority Queue implements Comparable interface also
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(19);
		pq.add(12);
		pq.add(3);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
