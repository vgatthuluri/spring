package com.avg.spring.rest.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;
	
	public Long getId(){
		return id;
	}
	
	private String userName;
	
	public String getUserName(){
		return userName;
	}
	
	@JsonIgnore
	private String password;
	public String getPassword(){
		return password;
	}
	
	@OneToMany(mappedBy = "account")
	private Set<Bookmark> bookmarks = new HashSet<Bookmark>();
	
	
	public Account(String name, String password) {
        this.userName = name;
        this.password = password;
    }
	
    Account() { // jpa only
    }
    
}
