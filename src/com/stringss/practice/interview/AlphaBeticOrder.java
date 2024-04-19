package com.stringss.practice.interview;

public class AlphaBeticOrder {

	public static void main(String[] args) {
		String str="nandish";
		char arr[] = str.toCharArray();
		char temp;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			} 
		} System.out.println(new String( arr));
	}
}
