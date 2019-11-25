/**
 * 
 */
package com.tnfigueiredo.sample.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Class to represent hotel bookings.
 * 
 * @author tnfigueiredo
 *
 */
@Document
public class Booking {
	
	@Id
	private String id;
	
	@Indexed(unique=true)
	private String reservationCode;
	
	private LocalDate bookingDate;
	
	private String hotel;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the reservationCode
	 */
	public String getReservationCode() {
		return reservationCode;
	}

	/**
	 * @param reservationCode the reservationCode to set
	 */
	public void setReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
	}

	/**
	 * @return the bookingDate
	 */
	public LocalDate getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @return the hotel
	 */
	public String getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

}
