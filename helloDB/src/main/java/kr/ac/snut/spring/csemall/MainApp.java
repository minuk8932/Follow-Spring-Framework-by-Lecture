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
		
		Offer offerObject = new Offer("rudy", "rudy@snut.ac.kr", "shield bug");
		
		if(offerDAO.insert(offerObject)) System.out.println("Object is Inserted!");
		else System.out.println("insert: failed!");
		
		offerObject = offerDAO.getOffer("rudy");
		System.out.println(offerObject);
		
		offerObject.setName("trash");
		if(offerDAO.update(offerObject)) System.out.println("update name: " + offerObject);
		else System.out.println("update: failed!");
		
		if(offerDAO.delete(offerObject.getId())) System.out.println("deleted!");
		else System.out.println("delete: failed!");
		
		context.close();
	}
}
