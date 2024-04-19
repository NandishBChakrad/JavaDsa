package com.stringss.practice.interview;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Nandish B Chakrad";
		char[] ch = str.toCharArray();
		int len = str.length();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	
	

}
