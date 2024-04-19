package com.stringss.practice.interview;

public class Test2 {
	public static void main(String[] args) {
		String str = "Interview";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			boolean flag = false;;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (flag==false) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
