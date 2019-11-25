package com.tnfigueiredo.sample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tnfigueiredo.sample.model.Booking;

/**
 * {@link Repository} for Booking operations.
 * 
 * @author tnfigueiredo
 *
 */
@Repository
public interface BookingRepository extends MongoRepository<Booking, String>{
	
	/**
	 * Search by hotel with hotel name
	 * 
	 * @param hotel name like parameter
	 * 
	 * @return {@link List} of {@link Booking} for hotels.
	 */
	List<Booking> findByHotelContaining(String hotel);

}
