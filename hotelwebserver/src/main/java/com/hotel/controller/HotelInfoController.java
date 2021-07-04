package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.bean.HotelInfo;
import com.hotel.bean.ReservationDetails;
import com.hotel.repository.HotelInfoRepository;



@RestController
public class HotelInfoController {
	@Autowired
	private HotelInfoRepository hotelRepo;
	
	@RequestMapping("/hotelList")
	public List<HotelInfo> getListOfHotel()
	{
		List<HotelInfo> hotelEntity = hotelRepo.findAllHotel();
		return hotelEntity;
	}
	
	@RequestMapping(value="/reservation", method=RequestMethod.POST, consumes="application/json")
	public String reserveHotel(@RequestBody ReservationDetails reservationDetails) {
		
		return reservationDetails.getHotel_name();
	}
}

