package kr.ac.snut.spring.di;

import lombok.Setter;

@Setter
public class Cat implements AnimalType{
	private String catName;
	
	@Override
	public void sound() {
		System.out.println("Cat name = " + catName + ": " + "Meow");
	}
}
