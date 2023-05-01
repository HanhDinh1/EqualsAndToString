package com.john.equalsandtostring;

import java.util.Objects;

public class Dog {

	private String name;
	private int age;
	
	public boolean equals (Object obj) {
		if (this == obj) { 
			return true;
		} 
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		
		Dog other = (Dog)obj; //<= type catching
		
		return Objects.equals(this.getName(), other.getName())&&
				Objects.equals (this.getAge(), other.getAge());
	
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
