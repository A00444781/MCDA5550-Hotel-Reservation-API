package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "price")
	private int price;
	
	@Column(name = "availability")
	private boolean availability;
	
	@Column(length = 25, name = "hotel_name", nullable = false)
	private String hotel_name;
	
	
	public HotelDetails() {}
	
	public HotelDetails(int price, boolean availability, String hotel_name) {
		super();
		this.price = price;
		this.availability = availability;
		this.hotel_name = hotel_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
}

