package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.bean.HotelDetails;



public interface HotelDetailsRepository extends CrudRepository<HotelDetails, Integer>{
	@Query(value ="select * from hotel_table", nativeQuery = true)
	List<HotelDetails> findAllHotel();

}
