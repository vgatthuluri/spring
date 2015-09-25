package com.avg.spring.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bookmark {

	@Id
	@GeneratedValue
	private Long id;
	public Long getId(){
		return id;
	}
	
	private String uri;
	public String getUri(){
		return uri;
	}
	
	private String description;
	public String getDescription(){
		return description;
	}
	
	@JsonIgnore
	@ManyToOne
	private Account account;
	public Account getAccount(){
		return account;
	}
	
	public Bookmark(Account account, String uri, String description) {
        this.uri = uri;
        this.description = description;
        this.account = account;
    }

	
}
