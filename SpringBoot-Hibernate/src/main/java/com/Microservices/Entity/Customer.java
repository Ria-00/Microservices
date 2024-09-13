package com.Microservices.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	private int ssn;
	private String name;
	private int age;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(column = @Column(name = "Current_street"), name = "street"),
			@AttributeOverride(column = @Column(name = "Current_city"), name = "city"),
			@AttributeOverride(column = @Column(name = "Current_state"), name = "state"),
			@AttributeOverride(column = @Column(name = "Current_zipcode"), name = "zipcode"), })
	private Address current_address;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(column = @Column(name = "permanent_street"), name = "street"),
			@AttributeOverride(column = @Column(name = "permanent_city"), name = "city"),
			@AttributeOverride(column = @Column(name = "permanent_state"), name = "state"),
			@AttributeOverride(column = @Column(name = "permanent_zipcode"), name = "zipcode"), })
	private Address permanent_address;

	private int phn;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

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


	public Address getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(Address current_address) {
		this.current_address = current_address;
	}

	public Address getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(Address permanent_address) {
		this.permanent_address = permanent_address;
	}

	public int getPhn() {
		return phn;
	}

	public void setPhn(int phn) {
		this.phn = phn;
	}

}
