package com.search;

public class LinearSearch {

	public static void main(String[] args) {
		DataSet lsd=new DataSet(10000);
		for(int i=0;i<lsd.getSize();i++) {
			lsd.numbertry++;
			if(lsd.data[i] == 700) {
				System.out.println("Number is found after :"+lsd.numbertry); break;
			}
		}
		
	}

}
