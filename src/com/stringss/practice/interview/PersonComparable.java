package com.stringss.practice.interview;

public class PersonComparable implements Comparable<PersonComparable>{
	private String name;
	private String city;
	private int id;
	
	public PersonComparable(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", id=" + id + "]";
	}
	@Override
	public int compareTo(PersonComparable o) {
		return this.city.compareTo(o.getCity());
	}

}