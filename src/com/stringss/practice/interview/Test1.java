package com.stringss.practice.interview;

public class Test1 {
	public static void main(String[] args) {
		String str = "Nandish";
		str=str.toLowerCase();
		char[] ch = str.toCharArray();
		char temp;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]>ch[j]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			}
		}System.out.println(ch);
	}
}
