package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.HotelDetails;
import com.example.demo.repository.HotelDetailsRepository;

@RestController
public class HotelController {
	
	@Autowired
	private HotelDetailsRepository hotelRepository;
	 
	 @RequestMapping("/hotelsList")
	 public List<HotelDetails> getListOfHotels() {
		 
		 List<HotelDetails> hotelEntity = hotelRepository.findAllHotel();
		 return hotelEntity;
	 }
	 
	 @RequestMapping("/test")
	 public String hello() {
		 return "hello";
	 }

}
