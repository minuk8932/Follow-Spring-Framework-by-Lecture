package kr.ac.snut.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Offer {
	private int id;
	
	@Size(min = 2, max = 50, message = "Name size must be between 2 and 50 chars")
	private String name;
	
	@Email(message = "Please enter a valid email address")
	@NotEmpty(message = "Email address cannot be empty")
	private String email;
	
	@Size(min = 1, max = 1000, message = "Text size must be between 1 and 1000 chars")
	private String text;
	
	public Offer() {}
	
	public Offer(int id, String name, String email, String text) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public Offer(String name, String email, String text) {
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email + ", text=" + text + "]";
	}
}
