package com.stringss.practice.interview;

import java.util.HashMap;
import java.util.Map;

//Printing answer in Map 
public class DuplicateValueArrayMap {
	public static void main(String[] args) {
		int[] arrays = {1,2,3,4,3,3,5,7,7};
		System.out.println(findingDuplicate(arrays));
	}

	private static Map<Integer,Integer> findingDuplicate(int[] arrays) {
		Map<Integer,Integer> mapOne = new HashMap<>();
		
		for(int array:arrays) {
			mapOne.put(array, mapOne.getOrDefault(array, 0) +1);
		}System.out.println(mapOne);
		
		Map<Integer,Integer> mapTwo = new HashMap<>();
		for(Map.Entry<Integer,Integer> entry : mapOne.entrySet()) {
			if(entry.getValue()>1) {
				mapTwo.put(entry.getKey(), entry.getValue());
			}
		}return mapTwo;
	}
}
