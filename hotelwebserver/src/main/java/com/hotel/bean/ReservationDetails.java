package com.hotel.bean;

import java.util.HashSet;
import java.util.List;
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
import javax.persistence.Table;

@Entity
@Table(name="HotelReservation")
public class ReservationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int confirmation_id;
	
	@Column(name = "hotel_name",length = 25, nullable = false)
	private String hotel_name;
	
	@Column(name = "checkin",length = 25, nullable = false)
	private String checkin;
	
	@Column(name = "checkout",length = 25, nullable = false)
	private String checkout;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "HotelReservation_HotelGuests",
    joinColumns = {
            @JoinColumn(name = "confirmation_id", referencedColumnName = "guest_id",
                    nullable = false, updatable = false)},
    inverseJoinColumns = {
            @JoinColumn(name = "guest_id", referencedColumnName = "confirmation_id",
                    nullable = false, updatable = false)})
	private Set<Guest> courses = new HashSet<>();
	
	
	//private List<Guest> guest_list;
	
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
	public List<Guest> getGuest_list() {
		return guest_list;
	}
	public void setGuest_list(List<Guest> guest_list) {
		this.guest_list = guest_list;
	}
	public int getConfirmation_id() {
		return confirmation_id;
	}
	public void setConfirmation_id(int confirmation_id) {
		this.confirmation_id = confirmation_id;
	}

}
