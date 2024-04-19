package com.stringss.practice.interview;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

	public static void main(String[] args) {
		int[] returnedArray = readingIntegers();
		System.out.println("Written array is " + Arrays.toString(returnedArray));
		System.out.println("minmum no is " + findMin(returnedArray));
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
}
