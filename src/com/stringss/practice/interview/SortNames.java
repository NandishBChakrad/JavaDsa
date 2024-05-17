package com.stringss.practice.interview;

public class SortNames {

	public static void main(String[] args) {
		String[] names = { "Nandish", "Amar", "Bhagath", "Sangolli", "Rayanna", "ChttraPati Shivaji" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if(compare(names[i],names[j])>0){
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}for(String name : names) {
			System.out.println(name);
		}
	}

	private static int compare(String string, String string2) {
		return string.compareTo(string2);
	}

}
