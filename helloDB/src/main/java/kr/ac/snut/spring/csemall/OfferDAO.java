package kr.ac.snut.spring.csemall;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("offerDAO")
public class OfferDAO {
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "SELECT COUNT(*) from offers";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	// Qeurying & returning a single object
	public Offer getOffer(String name) {
		String sqlStatement = "SELECT * from Offers WHERE name = ?";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] {name}, new OfferMapper());
	}
	
	// Qeurying & returning multiple objects
	public List<Offer> getOffers() {
		String sqlStatement = "SELECT * from Offers";
			
		return jdbcTemplateObject.query(sqlStatement, new OfferMapper());
	}
	
	public boolean insert(Offer offer) {		
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();

		String sqlStatement = "INSERT into Offers (name, email, text) values (?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] {name, email, text}) == 1);
	}
	
	public boolean update(Offer offer) {
		int id = offer.getId();
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();

		String sqlStatement = "UPDATE Offers set name = ?, email = ?, text = ? WHERE id = ?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] {name, email, text, id}) == 1);
	}
	
	public boolean delete(int id) {
		String sqlStatement = "DELETE from Offers WHERE id = ?";
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[] {id}) == 1);
	}
}
