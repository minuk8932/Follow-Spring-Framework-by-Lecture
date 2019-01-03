package kr.ac.snut.spring.csemall;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/ac/snut/spring/csemall/beans/beans.xml");
		
		OfferDAO offerDAO = (OfferDAO) context.getBean("offerDAO");
		System.out.println("The record count is " + offerDAO.getRowCount());
		
		List<Offer> offerList = offerDAO.getOffers();
		for(Offer rows: offerList) {
			System.out.println(rows);
		}
		
		StringBuilder insertObject = new StringBuilder();
		Offer insertData = new Offer("rudy", "rudy@snut.ac.kr", "shield bug");
		insertObject.append(insertData.getName()).append(", ").append(insertData.getEmail()).append(", ")
		.append(insertData.getText());
		
		if(offerDAO.insert(insertData)) System.out.println("Object " + "[" + insertObject + "]" + " is Inserted!");
		else System.out.println("faild!");
		
		
		
		context.close();
	}
}
