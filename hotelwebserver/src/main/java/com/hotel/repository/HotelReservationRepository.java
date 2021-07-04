package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.hotel.bean.ReservationDetails;

public interface HotelReservationRepository extends CrudRepository<ReservationDetails, Integer>{

	@Query(value ="select * from hotel_reservation", nativeQuery =true)
	List<ReservationDetails> findAllHotel();
}
