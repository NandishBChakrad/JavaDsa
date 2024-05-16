package com.stringss.practice.interview;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int a : array) {
			sum = sum + a;
		}System.out.println(sum);
		
		//2nd approach
		int ans = Arrays.stream(array).sum();
		System.out.println(ans);
	}

}
