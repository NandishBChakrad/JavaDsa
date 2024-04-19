package com.stringss.practice.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonRunnerComparable {

	public static void main(String[] args) {
		List<PersonComparable> personComparable = new ArrayList<>();
		personComparable.add(new PersonComparable("Raam","Ayodhya",9));
		personComparable.add(new PersonComparable("Lakshman","Bharath",7));
		personComparable.add(new PersonComparable("Seeta","Nepal",87));
		personComparable.add(new PersonComparable("Hanuman","Karnataka",10));
		personComparable.add(new PersonComparable("Bharath","Uttar Pradesh",65));
		
		
		Collections.sort(personComparable);
		
		System.out.println(personComparable);
	}

}
