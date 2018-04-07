package com.sortingalgorithm;

public class MergeSort {

	int array[];
	int temparray[];
	public MergeSort(int arr[]) {
		this.array=arr;
		this.temparray=new int[arr.length];
	}
	void doMergeSort(int lower,int higher){
		if(lower<higher) {
			int middile=lower+(higher-lower)/2;
			doMergeSort(lower,middile);
			doMergeSort(middile+1, higher);
			merge(lower,middile,higher);
		}
	}
	void merge(int lower,int middile,int higher) {
		for(int i=lower;i<=higher;i++) {
			temparray[i]=array[i];
		}
		int i=lower,j=middile+1,k=lower;
		while(i<= middile && j<=higher) {
			if(temparray[i] <= temparray[j]) {
				array[k]=temparray[i];
				i++;
			}
			else {
				array[k]=temparray[j];
				j++;
			}
			k++;
		}
		//Copy all the elments if any left from leftside
		while(i<=middile) {
			array[k]=temparray[i];
			k++;
			i++;
		}
		//Copy all the elments if any left from rightside
		while(j<=higher) {
			array[k]=temparray[j];
			k++;
			j++;
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,5,3,9,6,12,10};
		MergeSort ob=new MergeSort(arr);
		System.out.println("Before Sorting :");
		for(int i=0;i<arr.length;i++)
			System.out.print(","+arr[i]);
		ob.doMergeSort(0,arr.length-1);
		System.out.println("\n After Sorting:");
		for(int i=0;i<arr.length;i++)
			System.out.print(","+arr[i]);
	}
	
	
	

}
