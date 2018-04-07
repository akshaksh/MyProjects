package com.linklistimplement;

public class LinkList<T> {
Node head;
	public LinkList() {
		head=null;
	}
	public void add(Object value) {
		//insert at beg
		Node newNode=new Node(value,null);
		if(head==null)
			head=newNode;
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	public void delete() {
		head=head.next;
	}
	public void display() {
		Node newnode=head;
		while(newnode!=null) {
			System.out.println((T)newnode.value);
			newnode=newnode.next;
		}
	}
}
