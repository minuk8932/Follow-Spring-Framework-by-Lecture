package kr.ac.snut.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired
	@Qualifier(value = "qf_cat")
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
}
