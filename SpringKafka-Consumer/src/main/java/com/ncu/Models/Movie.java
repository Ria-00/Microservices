package com.ncu.Models;

public class Movie {
	
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
	
	public Movie() {}
	
	public Movie(int id, String title, double rating, int releaseyear) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.releaseyear = releaseyear;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + ", year=" + releaseyear + "]";
	}
	
}
