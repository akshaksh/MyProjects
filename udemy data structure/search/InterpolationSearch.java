package com.search;

public class InterpolationSearch {


	public static void main(String[] args) {
		DataSet lsd=new DataSet(1000000);
		int search=999999;
		boolean isFound=false;
		int low=0,high=lsd.getSize()-1;
		int mid=0;
		while(!isFound) {
			
			lsd.numbertry++;
			mid=low+((high-low)/(lsd.data[high]-lsd.data[low]))*(search-lsd.data[low]);
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
