package com.stringss.practice.interview;

public class WordAndCharCount {
	public static void main(String[] args) {
		String strings = "Hello World";

		for (String s : strings.split(" ")) {
			System.out.println("length of " + s + " is " + s.length());
		}
	}
}
