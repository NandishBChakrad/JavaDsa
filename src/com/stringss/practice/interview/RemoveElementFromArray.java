package com.stringss.practice.interview;

import java.util.Arrays;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		
		//create an array from which the element has to removed 
		int[] array = { 22, 23, 42, 21, 332, 23 };
		
		//element has to be removed
		int removeElement = 332;

		int arr[] = element(array, removeElement);
		System.out.println(Arrays.toString(arr));
		System.out.println("Original Array " + Arrays.toString(array));
		System.out.println("Changed Array " + Arrays.toString(arr));

	}

	public static int[] element(int[] newArray, int element) {
		int[] change = new int[newArray.length - 1];
		int index = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (element != newArray[i]) {
				change[index] = newArray[i];
				index++;
			}
		}
		return change;
	}
}
