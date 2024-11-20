package com.Springboot.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	private String name;
	private int age;
	
	@ManyToOne()
	private School scl;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AadharCard aadhar;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Subject> sub;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public AadharCard getAadhar() {
		return aadhar;
	}

	public void setAadhar(AadharCard aadhar) {
		this.aadhar = aadhar;
	}

	public Set<Subject> getSub() {
		return sub;
	}

	public void setSub(Set<Subject> sub) {
		this.sub = sub;
	}

	public School getScl() {
		return scl;
	}

	public void setScl(School scl) {
		this.scl = scl;
	}
	
	
}

