package com.Microservices.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")  //else the class name will be table name by default
public class Movie {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY) //auto increment the primary key.
	private int id;
	private String title;
	private double rating;
	private int releaseyear;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double d) {
		this.rating = d;
	}

	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + ", year=" + releaseyear + "]";
	}
	
}
