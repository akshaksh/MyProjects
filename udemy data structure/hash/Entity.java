package com.hash;

public class Entity {
int key;
Object value;
Entity next;
	public Entity(int key,Object value) {
		this.key=key;
		this.value=value;
		this.next=null;
	}

	public Entity() {next=null;}
	public int getKey() {
		return key;
	}
	public Object getValue() {
		return  value;
	}
}
