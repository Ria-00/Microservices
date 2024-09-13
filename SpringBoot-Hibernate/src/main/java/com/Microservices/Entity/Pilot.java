package com.Microservices.Entity;

import jakarta.persistence.Embeddable;

@Embeddable  //no create a new table but rather just embed the data into that very table;
public class Pilot {

	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
