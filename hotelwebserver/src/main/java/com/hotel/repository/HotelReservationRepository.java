package com.hotel.repository;

import org.springframework.data.repository.CrudRepository;
import com.hotel.bean.ReservationDetails;

public interface HotelReservationRepository extends CrudRepository<ReservationDetails, Integer>{

}
