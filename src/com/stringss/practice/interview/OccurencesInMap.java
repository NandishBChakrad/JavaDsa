package com.stringss.practice.interview;

import java.util.HashMap;
import java.util.Map;

//asked in 1st round of Impelsys, 2nd round "FizzBuzz" question.
public class OccurencesInMap {

	public static void main(String[] args) {
		String[] fruits = { "apple", "apple", "banana", "banana", "orange" };
		Map<String, Integer> map = new HashMap<>();
		for (String fruit : fruits) {
			if (map.containsKey(fruit)) {
				map.put(fruit, map.get(fruit) + 1);
			} else {
				map.put(fruit, 1);
			}
		}
		System.out.println(map);
	}

}
