package com.example.demo.entities;

public class HotelDetails {
	
	private String hotel_name;
	private int price;
	private boolean availability;
	
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int d) {
		this.price = d;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


}
