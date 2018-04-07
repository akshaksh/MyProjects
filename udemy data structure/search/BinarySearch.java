package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		DataSet lsd=new DataSet(100);
		int search=4;
		boolean isFound=false;
		int low=0,high=lsd.getSize()-1;
		int mid=0;
		while(!isFound) {
			
			lsd.numbertry++;
			mid=low+((high-low)/2);
			if(lsd.data[mid] == search) {
				System.out.println("Number found after try :"+lsd.numbertry);
				isFound=true;
				break;
			}
			if(lsd.data[mid]<search)
				low=mid+1;
			if(lsd.data[mid]>search)
				high=mid-1;
			if(low>high)
				break;
			
		}
		if(!isFound) {
			System.out.println("Number Not Found:");
		}

	}

}
