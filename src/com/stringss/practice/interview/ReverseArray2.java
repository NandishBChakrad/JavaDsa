package com.stringss.practice.interview;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray2 {

	public static void main(String[] args) {
		int[] returnedArray = readingIntegers();
		System.out.println("Written array is " + Arrays.toString(returnedArray));
		System.out.println("minmum no is " + findMin(returnedArray));

		System.out.println("before reverse" + Arrays.toString(returnedArray));
//		reverse(returnedArray);
		int[] reversedcopy = reverseArray(returnedArray);
		System.out.println("In second approach " + Arrays.toString(reversedcopy));
	}

	private static int[] readingIntegers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ths list of Integers, separated by comas");

		String input = scan.nextLine();
		String[] splits = input.split(",");
		int[] values = new int[splits.length];
		for (int i = 0; i < splits.length; i++) {
			values[i] = Integer.parseInt(splits[i].trim());
		}

		return values;
	}

	private static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int el : array) {
			if (el < min) {
				min = el;
			}
		}

		return min;
	}

	private static void reverse(int[] array) {
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;

		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;

			System.out.println("Reversed Array " + Arrays.toString(array));
		}
	}

	// other approach

	private static int[] reverseArray(int[] array) {
		int[] reversedArray = new int[array.length];
		int maxLength = array.length - 1;

		for (int el : array) {
			reversedArray[maxLength] = el;
			maxLength--;
		}
		return reversedArray;
	}
}
