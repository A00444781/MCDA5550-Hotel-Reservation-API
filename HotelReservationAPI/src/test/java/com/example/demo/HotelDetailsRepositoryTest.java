package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.demo.bean.HotelDetails;
import com.example.demo.repository.HotelDetailsRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class HotelDetailsRepositoryTest {
	
	@Autowired 
	private HotelDetailsRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void test() {
		
	}
	
	@Test
	public void createNewHotelDetails() {
		HotelDetails h1 = new HotelDetails(200,true,"Season Inn");
		HotelDetails h2 = new HotelDetails(400,true,"LA Hotel");
		HotelDetails h3 = new HotelDetails(201,true,"Comfort Inn");
		
		entityManager.persist(h1);
		entityManager.persist(h2);
		entityManager.persist(h3);
		
		
	}

}
