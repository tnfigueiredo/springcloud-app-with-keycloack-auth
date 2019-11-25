package com.tnfigueiredo.sample.service;

import java.util.List;

import com.tnfigueiredo.sample.model.Booking;

/**
 * Service operations for handling {@link Booking} operations.
 * 
 * @author tnfigueiredo
 *
 */
public interface BookingService {
	
	/**
	 * Operation for saving bookings for {@link Booking} object.
	 * 
	 * @param booking
	 * 
	 * @return saved {@link Booking}
	 */
	Booking saveUpdate(Booking booking);

	/**
	 * Listing all bookings for all hotels {@link Booking}.
	 * 
	 * @return {@link List} of matching hotel names.
	 * 
	 */
	List<Booking> listAll();
	
	/**
	 * Listing bookings containing hotel {@link Booking} name.
	 * 
	 * @param hotel booking name or part of it.
	 * 
	 * @return {@link List} of matching hotel names.
	 * 
	 */
	List<Booking> findByHotelName(String hotel);

}