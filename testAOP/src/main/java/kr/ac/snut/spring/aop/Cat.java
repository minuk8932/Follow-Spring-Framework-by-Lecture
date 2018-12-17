package kr.ac.snut.spring.aop;

import lombok.Setter;

@Setter
public class Cat implements AnimalType{
	private String catName;
	
	@Override
	public void sound() {
		System.out.println("Cat name = " + catName + ": " + "Meow");
	}
}
