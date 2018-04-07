package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableExample implements Externalizable{

	private String name;
	private int id;
	private transient String temp;
	public ExternalizableExample(){}
	public ExternalizableExample(String name,int id,String temp) {
		this.name=name;
		this.id=id;
		this.temp=temp;
	}
	@Override
	public void readExternal(ObjectInput out) throws IOException,
			ClassNotFoundException {
		name = (String) out.readObject();	
		id=(int)out.readInt();		
		temp=(String) out.readObject();
		
	}

	@Override
	public void writeExternal(ObjectOutput in) throws IOException {
		in.writeObject(name);
		in.writeInt(id);
		in.writeObject(temp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}
}
