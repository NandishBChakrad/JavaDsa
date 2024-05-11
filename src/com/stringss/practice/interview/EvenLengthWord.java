package com.stringss.practice.interview;

import java.util.Arrays;

public class EvenLengthWord {
	public static void main(String[] args) {
		String str = "Hello worlds Nandish";
		String[] strings = str.split(" ");
		System.out.println(Arrays.toString(strings));

		for (String string : strings) {

			if (string.length() % 2 == 0) {
				System.out.println(string + " has Even length" + " i.e, " + string.length());
			} else {
				System.out.println( string  + " has Odd Length" + " i.e, " + string.length());
			}
		}
	}
}
