package com.john.equalsandtostring;

public class EqualsAndToString {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.setAge(10);
		myDog.setName("Fido");
		
		Dog yourDog = new Dog();
		yourDog.setName("Kiki");
		
		if (myDog.equals(yourDog)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
		
//		int num1 = 2;
//		int num2 = 3;
//		
//		if(num1 == num2) {
//			
//		}

		
		System.out.println(myDog);
		

	}

}
