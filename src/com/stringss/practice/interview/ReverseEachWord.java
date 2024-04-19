package com.stringss.practice.interview;

public class ReverseEachWord {
	public static void main(String[] args) {
		String input = "Java Code";
		String rev = "";
		String[] words = input.split(" ");
		for (String word : words) {
			String reversedWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reversedWord = reversedWord + word.charAt(j);
			}
			rev = rev + reversedWord + " ";
		}
		System.out.println(rev.trim());
	}
}
