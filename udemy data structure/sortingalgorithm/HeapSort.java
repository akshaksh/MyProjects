package com.sortingalgorithm;

public class HeapSort {
static int total=0;
	static void swap(Comparable<Integer> arr[],int a,int b) {
		Comparable<Integer> ob=arr[a];
		arr[a]=arr[b];
		arr[b]=ob;
	}
	static void heapify(Comparable<Integer> arr[],int i) {
		int lft=i*2;
		int rgt=i*2+1;
		int grt=i;
		System.out.println("lft: "+lft+", rgt :"+rgt+", grt "+grt);
		if(lft<total && arr[lft].compareTo((Integer) arr[grt])>=0) {
			grt=lft;
			
		}
		if(rgt<total && arr[rgt].compareTo((Integer) arr[grt])>=0) {
			grt=rgt;
			
		}
		if(grt != i) {
			swap(arr,i,grt);
			heapify(arr,grt);
		}
	}
	static void sort(Comparable<Integer> arr[]) {
		total=arr.length-1;
		for(int i=total/2;i>=0;i--)
			heapify(arr,i);
		for(int i=total;i>0;i--) {
			swap(arr,0,i);
			total--;
			heapify(arr, 0);
		}
		
	}
	public static void main(String[] args) {

		//Integer a[]= {4,5,6,2,3,1,9,10,15,11,12,33,20};
		Integer a[]= {4,10,3,5,8,2,6};
		Integer temp=0;
		System.out.println("Before");
		for(Integer i:a) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		sort(a);
		System.out.println("\nAfter");
		for(Integer i:a) {
			System.out.print(i+",");
		}
	

	}

}
