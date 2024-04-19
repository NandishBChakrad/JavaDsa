package com.stringss.practice.interview;

public class Test3 {
	public static void main(String[] args) {
		int[] arrays = { 74,4,3,676,78,98,41};
		int min = arrays[0];
		for(int i=0;i< arrays.length;i++) {
			if(arrays[i]<min) {
				min=arrays[i];
			}
		}System.out.println(min);
	}
}
