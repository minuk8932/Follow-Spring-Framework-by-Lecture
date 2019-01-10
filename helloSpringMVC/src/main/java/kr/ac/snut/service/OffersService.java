package kr.ac.snut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.snut.dao.OfferDAO;
import kr.ac.snut.model.Offer;

@Service
public class OffersService {
	private OfferDAO offerDao;
	
	@Autowired
	public void setOfferDao(OfferDAO offerDao) {
		this.offerDao = offerDao;
	}
	
	public List<Offer> getCurrent(){
		return offerDao.getOffers();
	}
}
