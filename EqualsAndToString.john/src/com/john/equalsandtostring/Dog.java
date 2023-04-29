package com.john.equalsandtostring;

public class Dog {

	private String name;
	private int age;
	private int weight;
	
	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	void bark() {
		System.out.println("Bark! My name is " + name);
	}

	
	public void setName(String name) {
		this.name = name;
		
	}	
	public String toString() {
		return "This is a " + this.age + " year old dog " + "named " + this.name;
	}

	public void setAge(int age) {
		this.age = age;
		
	}
}
