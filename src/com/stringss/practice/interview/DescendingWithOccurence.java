package com.stringss.practice.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Java program to print characters in descending order of frequency
public class DescendingWithOccurence {

	public static void main(String[] args) {
		String string = "Mouses";
		Map<Character, Integer> map = new HashMap<>();

		char[] ch = string.toCharArray();

		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);

		List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());

		entryList.sort(new FrequencyComparator());

		for (Map.Entry<Character, Integer> entries : entryList) {
			System.out.println(entries.getKey() + "-->" + entries.getValue());
		}
	}
}

class FrequencyComparator implements Comparator<Map.Entry<Character, Integer>> {

	@Override
	public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
		int frequency = o1.getValue().compareTo(o2.getValue());
		if (frequency == 0) {
			return o1.getKey().compareTo(o2.getKey());
		}
		return frequency;
	}
}
