package com.hibernate.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	UserKey userKey;
	
	private String name;
	
	@Id
	public UserKey getUserKey() {
		return userKey;
	}

	public void setUserKey(UserKey userKey) {
		this.userKey = userKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
