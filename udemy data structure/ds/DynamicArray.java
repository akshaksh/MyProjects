package com.ds;

import java.util.Arrays;

public class DynamicArray<T> {

	Object[] data;
	int size;
	public DynamicArray() {
		size=0;
		data=new Object[1];
	}
	public int getSize() {
		return data.length;
	}
	public T get(int index){
		return (T)data[index];
	}
	public void put(Object element){
		ensureCapacity(size+1);
		data[size++]=element;
	}
	public void ensureCapacity(int minimumcapacity) {
		int oldcapacity=getSize();
		if(minimumcapacity>oldcapacity) {
			int newCapacity=oldcapacity*2;
			if(newCapacity<minimumcapacity)
				newCapacity=minimumcapacity;
			data=Arrays.copyOf(data, newCapacity);
		}
	}
}
