package kr.ac.snut.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("/kr/ac/snut/spring/di/beans/animal.xml");
		
		PetOwner person = (PetOwner) context.getBean("petOwner");
		person.play();
		
		context.close();
	}
}
