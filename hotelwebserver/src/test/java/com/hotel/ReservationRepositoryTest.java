package com.hotel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.hotel.bean.Gender;
import com.hotel.bean.Guest;
import com.hotel.bean.ReservationDetails;
import com.hotel.repository.HotelReservationRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ReservationRepositoryTest {
	
	 @Autowired
	 private HotelReservationRepository Repo;
	 
	 @Autowired
	 private TestEntityManager entityManager;
	 
	 @Test
	 public void test() {
		 
	 }
	 
	 @Test 
	 public void createOneNewGuest() {
		 Guest guest1 = new Guest("JJ",Gender.MALE);
		 
		 entityManager.persist(guest1);
	 }
	 
	 @Test
	 public void createOneReservationWithOneGuest() {
		 Guest guest2 = new Guest("Evan",Gender.FEMALE);
		 
		 ReservationDetails reserv1 = new ReservationDetails("Comfot Inn","20210708","20211111");
		 reserv1.addGuest(guest2);
		 
		 Repo.save(reserv1);
		 
		 //reserv1.getConfirmation_id();
	 }


}
