package com.hotel.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="HotelGuests")
public class Guest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guest_id;
	
	@Column(name = "guest_name",length = 25, nullable = false)
	private String guest_name;
	
	@Column(name = "gender",length = 25, nullable = false)
	private Gender gender;
	
	@ManyToMany(mappedBy = "HotelGuests", fetch = FetchType.LAZY)
	private Set<ReservationDetails> students = new HashSet<>();
	
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
