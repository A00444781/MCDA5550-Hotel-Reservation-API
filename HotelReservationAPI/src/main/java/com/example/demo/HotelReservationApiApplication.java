package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(value = {"com.example.demo.repository"})
public class HotelReservationApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelReservationApiApplication.class, args);
	}

}
