package com.stringss.practice.interview;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		String string = "aabb";
		System.out.println(string.length());
		counts(string);
	}
	
	public static void counts(String string) {
		String vowels = "aeiouAEIOU"; 
		int countVowels = 0;
		int countConsonants = 0;
		for(int i=0;i<string.length();i++) {
			if(vowels.indexOf(string.charAt(i))!=-1) {
				countVowels++;
			}else {
				countConsonants++;
			}
		}System.out.println(countVowels);
		System.out.println(countConsonants);
	}

}
