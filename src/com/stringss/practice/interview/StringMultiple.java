package com.stringss.practice.interview;

import java.util.Map;
import java.util.TreeMap;

public class StringMultiple {

	public static void main(String[] args) {
		String inputString = "I Am LeaRning Java";

		System.out.println(vowelsCount(inputString));

		System.out.println(wordsCount(inputString));

		System.out.println(charCount(inputString));

		System.out.println(upperCaseCheck(inputString));

	}

	public static int vowelsCount(String string) {
		String vowels = "aeiouAEIOU";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (vowels.indexOf(string.charAt(i)) != -1) {
				count++;
			}
		}
		return count;
	}

	public static int wordsCount(String string) {
		String[] s = string.split(" ");
		return s.length;
	}

	public static Map<Character, Integer> charCount(String string) {
		Map<Character, Integer> map = new TreeMap<>();
		for (char c : string.toCharArray()) {
			if (Character.isLetter(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		return map;
	}

	public static int upperCaseCheck(String string) {

		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				count++;
			}
		}
		return count;
	}
}
