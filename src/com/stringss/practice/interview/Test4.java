package com.stringss.practice.interview;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
	public static void main(String[] args) {
		String str = "Laptop";
		str = str.toLowerCase().replace(" ", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			map.put(str.charAt(i), count);

		}
		System.out.println(map);
	}
}
