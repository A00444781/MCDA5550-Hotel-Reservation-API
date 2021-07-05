package com.hotel.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guest_id;
	
	@Column(name = "guest_name",length = 45)
	private String guest_name;
	
	@Column(name = "gender")
	private Gender gender;
	
	
	public Guest() {
		
	}
	
	public Guest(String guest_name, Gender gender) {
		super();
		this.guest_name = guest_name;
		this.gender = gender;
	}
	
	public String getGuest_Name() {
		return guest_name;
	}
	public void setGuest_Name(String guest_Name) {
		this.guest_name = guest_Name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
