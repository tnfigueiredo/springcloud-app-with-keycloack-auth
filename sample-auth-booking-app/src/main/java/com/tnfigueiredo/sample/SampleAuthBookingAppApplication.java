package com.tnfigueiredo.sample;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.tnfigueiredo.sample.common.BookingBuilder;
import com.tnfigueiredo.sample.service.BookingService;

@SpringBootApplication
public class SampleAuthBookingAppApplication {
	
	@Autowired
	private BookingService bookingService;
	
	@EventListener(ApplicationReadyEvent.class)
	public void applicationDataBootstrap() {
		int bookingAmmount = new Random().nextInt(99);
		for(int i = 0; i < bookingAmmount; i++) {
			bookingService.saveUpdate(
					new BookingBuilder()
					.withReservationCode(Integer.toString(new Random().nextInt(99999)))
					.withHotel("Hotel Reserved " + i)
					.withBookingDate(LocalDate.of(2020, new Random().nextInt(11)+1 , new Random().nextInt(27)+1))
					.build());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleAuthBookingAppApplication.class, args);
	}

}
