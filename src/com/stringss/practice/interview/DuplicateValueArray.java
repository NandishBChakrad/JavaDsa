package com.stringss.practice.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateValueArray {
	public static void main(String[] args) {
		int[] input = {1,2,3,4,4,5,5,6,6,};
		List<Integer> result = findDuplicates(input);
		System.out.println(result);
	}
	public static List<Integer> findDuplicates(int[] nums){
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> duplicates = new ArrayList<>();
		
		for(int num: nums) {
			map.put(num, map.getOrDefault(num, 0 )+1);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				duplicates.add(entry.getKey());
			}
		}return duplicates;
	}
	
}
