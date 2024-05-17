package com.stringss.practice.interview;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		String input = "001";
		int firstNumber = Character.getNumericValue(input.charAt(0));
		int lastNumber = Character.getNumericValue(input.charAt(input.length() - 1));
		System.out.println("firstnumber is " + firstNumber + " and last number is " + lastNumber);
		int ans = firstNumber + lastNumber;
		System.out.println("Sum is " + ans);

	}

}
