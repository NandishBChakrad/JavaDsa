package com.stringss.practice.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str = "Nandish B Chakrad";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch, i + 1);
			if (index == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
		System.out.println();

		// 2nd approach
		StringBuilder sb2 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println(set + "_____________");
		for (char ch : set) {
			sb2.append(ch);
		}
		System.out.println(sb2);
	}

}