/**
 * 
 */
package com.tnfigueiredo.sample.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tnfigueiredo.sample.model.Booking;
import com.tnfigueiredo.sample.service.BookingService;

/**
 * Simple RESTful controller to handle books.
 * 
 * @author tnfigueiredo
 *
 */
@RestController
@RequestMapping("bookings")
public class BookingResource {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping(produces = "application/json")
    public List<Booking> getBookings() {
        return bookingService.listAll();
    }
	
}
