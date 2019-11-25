package com.tnfigueiredo.sample.common;

import java.time.LocalDate;

import com.tnfigueiredo.sample.model.Booking;

public class BookingBuilder {
	
	private String id;
	
	private String reservationCode;
	
	private LocalDate bookingDate;
	
	private String hotel;
	
	/**
	 * Builder operation to return customized {@link Booking} object
	 * @return customized {@link Booking} object
	 */
	public Booking build() {
		Booking booking = new Booking();
		booking.setId(this.id);
		booking.setReservationCode(this.reservationCode);
		booking.setBookingDate(this.bookingDate);
		booking.setHotel(this.hotel);
		return booking;
	}
	
	/**
	 * Add an ID for the booking object.
	 * 
	 * @param id for the {@link Booking} object
	 * 
	 * @return the {@link BookingBuilder} itself
	 */
	public BookingBuilder withId(String id) {
		this.id = id;
		return this;
	}
	
	/**
	 * Add a reservationCode for the booking object.
	 * 
	 * @param reservationCode for the {@link Booking} object
	 * 
	 * @return the {@link BookingBuilder} itself
	 */
	public BookingBuilder withReservationCode(String reservationCode) {
		this.reservationCode = reservationCode;
		return this;
		
	}
	
	/**
	 * Add a bookingDate for the booking object.
	 * 
	 * @param bookingDate for the {@link Booking} object
	 * 
	 * @return the {@link BookingBuilder} itself
	 */
	public BookingBuilder withBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
		return this;
	}
	
	/**
	 * Add a hotel name for the booking object.
	 * 
	 * @param hotel name for the {@link Booking} object
	 * 
	 * @return the {@link BookingBuilder} itself
	 */
	public BookingBuilder withHotel(String hotel) {
		this.hotel = hotel;
		return this;
	}

}
