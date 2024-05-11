package com.stringss.practice.interview;

public class ComapareTwoStrings {

	public static void main(String[] args) {
		String str1 = "nandish";
		String str2 = "naNdish";
		boolean flag = false;
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not equal");
		}

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}
}
