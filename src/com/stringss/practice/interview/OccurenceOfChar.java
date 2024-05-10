package com.stringss.practice.interview;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {
	public static void main(String[] args) {
		String str = "I am Nandish B Chakrad";
		str = str.replace(" ", "");
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			map.put(ch[i], count);
		}
		System.out.println(map);
	}
}
