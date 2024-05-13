package com.stringss.practice.interview;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 5, 6, 9, 9 };
		missingNumber(numbers);
	}

	public static void missingNumber(int[] numbers) {
		Set<Integer> setNumbers = new HashSet<>();

		for (int num : numbers) {
			setNumbers.add(num);
		}
		int min = Collections.min(setNumbers);
		int max = Collections.max(setNumbers);

		for (int i = min; i <= max; i++) {
			if (!setNumbers.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
