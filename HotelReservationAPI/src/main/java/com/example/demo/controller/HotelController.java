package com.example.demo.controller;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.HotelDetails;
import com.example.demo.entities.ReservationDetails;

@RestController
public class HotelController {
	
	 @RequestMapping("/hello")
	 public String sayhi() {
		 return "hi";
	 }
	 
	 
	 @RequestMapping("/hotelsList")
	 public List<HotelDetails> getListOfHotels() {
		 
		 return getHotelList();
	 }
	 
	 @RequestMapping(value="/reservation", method=RequestMethod.POST, consumes="application/json")
	 public String reserveHotel(@RequestBody ReservationDetails reservationDetails) {
		 
		 return "Confirmation number is 12345 for the hotel: "+reservationDetails.getHotel_name();
	 }
	 
	 public List<HotelDetails> getHotelList(){
		 
		 List<HotelDetails> hotelsList = new ArrayList<HotelDetails>();
		 List<String> hotelNames =Arrays.asList("Season Inn", "Holiday Inn", "Comfort Inn");
		 Random random = new Random();
		 for(int i=0; i<hotelNames.size(); i++) {
			 
			 HotelDetails hotelDetails = new HotelDetails();
			 hotelDetails.setHotel_name(hotelNames.get(i));
			 hotelDetails.setAvailability(false);
			 
			 int randomPrice = random.nextInt(300 - 50 + 1) + 50;
			 hotelDetails.setPrice(randomPrice);
			 
			 hotelsList.add(hotelDetails);
			 hotelDetails = null;
		 }
		 
		 return hotelsList;
	 }
	 
	
}
