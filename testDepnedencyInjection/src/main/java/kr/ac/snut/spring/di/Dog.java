package kr.ac.snut.spring.di;

public class Dog implements AnimalType {
	private String dogName; 
	
	@Override
	public void sound() {
		System.out.println("Dog name = " + dogName + ": " + "Bow Wow");
	}

}
