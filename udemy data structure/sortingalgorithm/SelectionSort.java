package com.sortingalgorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {4,5,6,2,3,1,9,10,15,11,12,33,20};
		int temp=0;
		for(int i:a) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		int index;
		for(int i=0;i<a.length;i++) {
			index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
			}
			temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
		for(int i:a) {
			System.out.print(i+",");
		}
	}

}
