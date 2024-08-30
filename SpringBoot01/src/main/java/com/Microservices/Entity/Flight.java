package com.Microservices.Entity;

public class Flight {

	private String id;
	private String source;
	private String dest;
	private int avail_seats;
	private float price;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getAvail_seats() {
		return avail_seats;
	}
	public void setAvail_seats(int avail_seats) {
		this.avail_seats = avail_seats;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Flight [source=" + source + ", dest=" + dest + ", avail_seats=" + avail_seats + ", price=" + price
				+ "]";
	}
	
	
}
