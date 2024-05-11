package com.stringss.practice.interview;


//String reverse using recursion
public class ReverseWithRecursion {
	public static void main(String[] args) {
	String s = "Nandish B Chakrad";
	System.out.println("original String " + s);
	System.out.println("Reversed String " +reverseString(s));
	}
	
	public static String reverseString(String s) {
		if(s==null || s.length()<=1) {
			return s;
		}
		return reverseString(s.substring(1))+ s.charAt(0);
	}
}
