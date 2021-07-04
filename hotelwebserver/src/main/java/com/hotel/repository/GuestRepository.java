package com.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import com.hotel.bean.Guest;

public interface GuestRepository extends CrudRepository<Guest,Integer>{

}
