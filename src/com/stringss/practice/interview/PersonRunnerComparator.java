package com.stringss.practice.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class IdComparator implements Comparator<PersonComparator> {

	@Override
	public int compare(PersonComparator o1, PersonComparator o2) {
		return o1.getName().compareTo(o2.getName());
	}
	 
 }
public class PersonRunnerComparator {

	public static void main(String[] args) {
		List<PersonComparator> personComparator = new ArrayList<>();
		personComparator.add(new PersonComparator("Raam","Ayodhya",9));
		personComparator.add(new PersonComparator("Lakshman","Bharath",7));
		personComparator.add(new PersonComparator("Seeta","Nepal",87));
		personComparator.add(new PersonComparator("Hanuman","Karnataka",10));
		personComparator.add(new PersonComparator("Bharath","Uttar Pradesh",65));
		
		
		Collections.sort(personComparator, new IdComparator());
		System.out.println(personComparator);
	}

}
