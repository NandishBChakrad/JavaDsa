package com.stringss.practice.interview;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 8, 7, 8, 9, 3 };

		intersectArrays(arr1, arr2);
	}

	public static void intersectArrays(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println("Intersection of arrays is " + arr1[i]);
					break;
				}
			}
		}
	}
}
