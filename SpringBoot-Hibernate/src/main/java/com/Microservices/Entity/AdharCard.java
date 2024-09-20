package com.Microservices.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AdharCard {

	@Id
	private long adhar_num;
	
	@OneToOne(mappedBy = "ad_num")
	private Person p;
	private String address;
	
	public long getAdhar_num() {
		return adhar_num;
	}
	public void setAdhar_num(long adhar_num) {
		this.adhar_num = adhar_num;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
