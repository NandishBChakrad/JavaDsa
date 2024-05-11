package com.stringss.practice.interview;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strings = scan.nextLine();
		char[] ch = strings.toCharArray();
		int count = 0;
		for(char c: ch) {
			switch(c) {
			case('a'):
			case('e'):
			case('i'):
			case('o'):
			case('u'):
				count ++;
				break;
			}
		}System.out.println(count);
	}
}
