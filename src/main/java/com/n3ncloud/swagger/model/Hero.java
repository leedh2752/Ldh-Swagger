package com.n3ncloud.swagger.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "hero")
@Getter
@Setter
public class Hero implements Serializable{
	
	private static final long serialVersionUID = 1234L;
	
//	@Id
//	@GeneratedValue
	private int id;
	
	private String name;

	public Hero() {
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + "]";
	}

	public Hero(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
