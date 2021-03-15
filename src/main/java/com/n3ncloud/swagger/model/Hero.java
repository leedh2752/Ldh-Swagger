package com.n3ncloud.swagger.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "hero")

@Getter
@Setter
public class Hero implements Serializable{
	
	private static final long serialVersionUID = 1234L;
	
	@Id
	private int id;
	
	private String name;

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

	@Builder
	public Hero(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Hero() {}
}
