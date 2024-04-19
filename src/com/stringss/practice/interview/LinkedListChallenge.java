package com.stringss.practice.interview;

import java.util.LinkedList;

record Place(String name, int distance) {
	@Override
	public String toString() {
		return String.format("%s (%d)", name, distance);
	}
}

public class LinkedListChallenge {

	public static void main(String[] args) {
		LinkedList<Place> placesToVisit = new LinkedList<>();
		Place first = new Place("Bengaluru", 370);
		addPlace(placesToVisit, first);
		addPlace(placesToVisit, new Place("Kodagu", 400));
		addPlace(placesToVisit, new Place("Mangaluru", 150));
		addPlace(placesToVisit, new Place("Udupi", 120));
		addPlace(placesToVisit, new Place("Shivmogga", 289));
		addPlace(placesToVisit, new Place("Hassan", 390));
		addPlace(placesToVisit, new Place("Mysore", 480));
		addPlace(placesToVisit, new Place("Guthigar", 0));
		System.out.println(placesToVisit);
	}

	private static void addPlace(LinkedList<Place> list, Place place) {

		if (list.contains(place)) {
			System.out.println("Found duplicate " + place);
			return;
		}
		for (Place p : list) {
			if (p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Found duplicate " + place);
				return;
			}
			int matchedIndex = 0;
			for (var listPlace : list) {
				if (place.distance() < listPlace.distance()) {
					list.add(matchedIndex, place);
					return;
				}
				matchedIndex++;
			}
		}
		list.add(place);
	}
}
