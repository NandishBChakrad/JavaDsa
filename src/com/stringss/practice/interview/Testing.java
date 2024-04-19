package com.stringss.practice.interview;

public class Testing {

	public static void main(String[] args) {
		int[] arr = { 22, 33, 44, 56, 7, 23 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min=arr[i];
			}
		}System.out.println(min);
	}

}
