package kr.ac.snut.spring.csemall;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OfferMapper implements RowMapper<Offer> {

	@Override
	public Offer mapRow(ResultSet res, int rowNum) throws SQLException {
		Offer offer = new Offer();
		
		offer.setId(res.getInt("id"));
		offer.setName(res.getString("name"));
		offer.setEmail(res.getString("email"));
		offer.setText(res.getString("text"));
	
		return offer;
	}
	
}
