package com.hotel.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.bean.Gender;
import com.hotel.bean.Guest;
import com.hotel.bean.HotelInfo;
import com.hotel.bean.ReservationDetails;
import com.hotel.repository.GuestRepository;
import com.hotel.repository.HotelInfoRepository;
import com.hotel.repository.HotelReservationRepository;



@RestController
public class HotelInfoController {
	@Autowired
	private HotelInfoRepository hotelRepo;
	
	@Autowired
	private GuestRepository guestRepo;
	
	@Autowired
	private HotelReservationRepository hotelReservationRepo;
	
	@RequestMapping("/hotelList")
	public List<HotelInfo> getListOfHotel()
	{
		List<HotelInfo> hotelEntity = hotelRepo.findAllHotel();
		return hotelEntity;
	}
	
	@RequestMapping(value="/reservation", method=RequestMethod.POST, consumes="application/json")
	public int reserveHotel(@RequestBody ReservationDetails reservationDetails) {
		
		ReservationDetails reservationDetails1 = new ReservationDetails(reservationDetails.getHotel_name(), reservationDetails.getCheckin(), reservationDetails.getCheckout());
		Set<Guest> guestList=reservationDetails.getGuests_list();
		
		for(Guest guest:guestList) {
			String guest_name = guest.getGuest_Name();
			Gender gender = guest.getGender();
			
			Guest guest1 = new Guest(guest_name,gender);
			guestRepo.save(guest1);
			
			reservationDetails1.addGuest(guest1);
		}
		hotelReservationRepo.save(reservationDetails1);
		
//		for(int i = 0; i < guestList.size(); i++) {
//			Guest guest = new Guest(guestList.get(i).getGuest_Name(), guestList.get(i).getGender());
//			guestRepo.save(guest);
//			
//			reservationDetails1.addGuest(guest);
//			//guestRepo.save(guest);
//		}
//		hotelReservationRepo.save(reservationDetails1);
		
		return reservationDetails1.getConfirmation_id();
	}
}