package com.stringss.practice.interview;

public class FirstLetterOfWord {
	public static void main(String[] args) {
		String string = "I am Nandish B Chakrad";
		firstWord(string);
	}
	
	public static void firstWord(String string) {
		String[] str = string.split(" ");
		for(String s : str) {
			System.out.println(s.charAt(0));
		}
	}
}
