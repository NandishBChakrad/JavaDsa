package com.stringss.practice.interview;

public class ReverseArray {

	public static void main(String[] args) {
	int [] array = { 1,28,662,99,53,82};
	System.out.println("Before Reverse ");
	printArray(array);
	
	reverseArray(array);
	
	System.out.println("\nAfter Reverse ");
	printArray(array);
	}
	
	public static void reverseArray(int[] array) {
		int temp;
		for(int i = 0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}

	public static void printArray(int[] array) {
		for(int num: array) {
			System.out.print(num + " ");
		}
	}

}
