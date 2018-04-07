package com.queue;

public class QueueArray<T> {
Object[] ArrayQueue;
int rear,front,size;
public QueueArray(int size) {
	this.size=size;
	front=rear=-1;
	ArrayQueue =new Object[this.size];
}
public Boolean isFull() {
	return rear==size-1;
}
public Boolean isEmpty() {
	return front == -1;
}
public void Queue(Object element) {
	if(isFull()) {
		System.out.println("Queue is full");
	}
	rear=rear+1;
	ArrayQueue[rear]=element;
	if(front == -1)
		front=front+1;
}
public T Dequeue(){
	
	if(!isEmpty()) {
		return (T)ArrayQueue[front++];
	}
	else {
		//System.out.println("Queue is empty");
		return null;
	}
}
}
