package com.stringss.practice.interview;

public class ReplaceWithOccurence {
	public static void main(String[] args) {
		String str = "I am an Indian";
		char ch = 'i';
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (char c : str.toCharArray()) {
			if (c == ch) {
				sb.append(count);
				count++;
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
