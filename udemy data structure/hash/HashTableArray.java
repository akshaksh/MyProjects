package com.hash;

public class HashTableArray<T> {
Entity[] arrayhash;
int size;
	public HashTableArray(int size) {
		this.size=size;
		arrayhash=new Entity[size];
		for(int i=0;i<size;i++)
			arrayhash[i]=new Entity();
	}
	public void put(int key,Object value) {
		//Kind of Beg insert
		int hash=getHash(key);
		Entity ArrayValue=arrayhash[hash];
		Entity newEntry=new Entity(key,value);
		newEntry.next=ArrayValue.next;
		ArrayValue.next=newEntry;
	}
	public T get(int key) {
		T value=null;
		Entity Arrayvalue=arrayhash[getHash(key)];
		while(Arrayvalue != null) {
			if(Arrayvalue.getKey() == key)
			{
				value=(T)Arrayvalue.getValue();
				break;
			}
			else {
				Arrayvalue=Arrayvalue.next;
			}
			
		}
		return value;
	}
	public int getHash(int key) {
		return key%size;
	}
}
