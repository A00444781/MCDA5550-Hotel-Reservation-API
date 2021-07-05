package com.hotel.bean;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class ReservationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int confirmation_id;
	
	@Column(name = "hotel_name",length = 45, nullable = false)
	private String hotel_name;
	
	@Column(name = "checkin",length = 45, nullable = false)
	private String checkin;
	
	@Column(name = "checkout",length = 45, nullable = false)
	private String checkout;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(
    joinColumns = {
            @JoinColumn(name = "confirmation_id", referencedColumnName = "confirmation_id",
                    nullable = false, updatable = false)},
    inverseJoinColumns = {
            @JoinColumn(name = "guest_id", referencedColumnName = "guest_id",
                    nullable = false, updatable = false)})
	
	private Set<Guest> guests_list = new HashSet<>();
	//private Set<Guest> guests_list;
	

//	public Set<Guest> getGuests_list() {
//		return guests_list;
//	}
//	
//	public void setGuests_list(Set<Guest> guests_list) {
//		this.guests_list = guests_list;
//	}
	
	
	public Set<Guest> getGuests_list() {
		return guests_list;
	}
	public void setGuests_list(Set<Guest> guests_list) {
		this.guests_list = guests_list;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public int getConfirmation_id() {
		return confirmation_id;
	}
	public void setConfirmation_id(int confirmation_id) {
		this.confirmation_id = confirmation_id;
	}
	
	public void addGuest(Guest guest) {
		this.guests_list.add(guest);
	}
	
	public ReservationDetails() {
		
	}
	
	
	public ReservationDetails(String hotel_name, String checkin, String checkout) {
		super();
		this.hotel_name = hotel_name;
		this.checkin = checkin;
		this.checkout = checkout;
	}

}
