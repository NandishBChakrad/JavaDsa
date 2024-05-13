package com.stringss.practice.interview;

public class Panagram {
// this code is to check whether it contains all English alphabets or not
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		str = str.toLowerCase();
		System.out.println(panagram(str));

	}
	private static boolean panagram(String str) {
		if (str.length() < 26) {
			return false;
		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (str.indexOf(ch) == -1) {
				return false;
			}
		}
		return true;
	}
}
