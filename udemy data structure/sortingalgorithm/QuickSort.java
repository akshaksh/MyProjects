package com.sortingalgorithm;

public class QuickSort {
	static int stry=0;
	static void quicksorting(int arr[],int low,int high) {
		stry++;
		if(low>high) {
			return;
		}
		int mid =low +(high-low)/2;
		int pivot=arr[mid];
		int i=low;
		int j=high;
		while(i<=j) {
			while(arr[i]<pivot)
				i++;
			while(arr[j]>pivot)
				j--;
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
		}
		if(low<j) {
			//System.out.println("low:"+low+", high"+j+", pivot"+pivot);
			quicksorting(arr, low, j);
		}
		if(high>i) {
			//System.out.println("right low:"+i+", high"+high+", pivot"+pivot);
			quicksorting(arr, i, high);
		}
	}

	public static void main(String[] args) {
		int arr[]= {4,5,16,2,3,1,9,10,25,11,12,33,5,23};
		for(int i:arr) {
			System.out.print(i+",");
		}
		System.out.println("\n");
		quicksorting(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+",");
		}
		

	}

}
