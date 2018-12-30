package kr.ac.snut.spring.csemall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/ac/snut/spring/csemall/beans/beans.xml");
		
		OfferDAO offerDAO = (OfferDAO) context.getBean("offerDAO");
		System.out.println("The record count is " + offerDAO.getRowCount());
		
		context.close();
	}
}
