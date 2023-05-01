package com.john.equalsandtostring;

public class EqualsAndToString {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
			myDog.setName("Fido");	
			myDog.setAge(10);
		
		Dog yourDog = new Dog();
			yourDog.setName("Fido");
			yourDog.setAge(10);
		
		
		if (myDog.equals(yourDog)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
		System.out.println(myDog);
		

	}

}
