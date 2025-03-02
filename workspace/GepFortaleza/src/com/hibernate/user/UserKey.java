package com.hibernate.user;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserKey implements Serializable{

	private int id;
	private String email;
	
	
	public UserKey(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
