package com.qa.persistence.domain;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


@Entity
public class Recipe {
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Id 
	private Long id; 
	
	private String title; 
	private String description; 
	

	public Recipe() { 
		
	} 
	
	public Recipe(String title, String description) { 
		this.title = title; 
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
