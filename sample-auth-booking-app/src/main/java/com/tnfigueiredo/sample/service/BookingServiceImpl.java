/**
 * 
 */
package com.tnfigueiredo.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnfigueiredo.sample.model.Booking;
import com.tnfigueiredo.sample.repository.BookingRepository;

/**
 * Service class for booking operations.
 * 
 * @author tnfigueiredo
 *
 */
@Service(value = "bookingService")
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository repository;
	
	/* (non-Javadoc)
	 * @see com.tnfigueiredo.sample.service.BookingService#saveUpdate(com.tnfigueiredo.sample.model.Booking)
	 */
	public Booking saveUpdate(Booking booking) {
		return repository.save(booking);
	}
	
	/* (non-Javadoc)
	 * @see com.tnfigueiredo.sample.service.BookingService#findByHotelName(java.lang.String)
	 */
	public List<Booking> findByHotelName(String hotel){
		return repository.findByHotelContaining(hotel);
	}

	/*
	 * (non-Javadoc)
	 * @see com.tnfigueiredo.sample.service.BookingService#listAll()
	 */
	public List<Booking> listAll() {
		return repository.findAll();
	}

}
