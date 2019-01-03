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
		
//		Offer insertData = new Offer("rudy", "rudy@snut.ac.kr", "shield bug");
//		
//		if(offerDAO.insert(insertData)) System.out.println("Object is Inserted!");
//		else System.out.println("faild!");
		
		Offer updateData = offerDAO.getOffer("rudy");
		System.out.println(updateData);
		
		updateData.setName("trash");
		if(offerDAO.update(updateData)) System.out.println("update name: " + updateData);
		else System.out.println("faild!");		
		
		context.close();
	}
}
