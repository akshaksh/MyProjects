package com.sortingalgorithm;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {4,5,6,2,3,1,9,10,15,11,12,33,20};
		int temp=0;
		for(int i:a) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
			
		}
		for(int i:a) {
			System.out.print(i+",");
		}
	}

}
