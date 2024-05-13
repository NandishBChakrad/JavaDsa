package com.stringss.practice.interview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String string1 = "Listen";
		String string2 = "SIlent";
		
		boolean flag =checkAnagram(string1,string2);
		System.out.println(flag);
		
	}
	
	public static boolean checkAnagram(String string1, String string2) {
		if(string1.length()!=string2.length()) {
			return false;
		}
		
		string1= string1.toLowerCase();
		string2 = string2.toLowerCase();
		
		char[] ch1= string1.toCharArray();
		char[] ch2= string2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			return true;
		}else {
			return false;	
		}
	}
}
