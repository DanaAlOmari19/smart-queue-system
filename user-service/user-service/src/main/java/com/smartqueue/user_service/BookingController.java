package com.smartqueue.user_service;

import com.smartqueue.user_service.model.Booking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private List<Booking> bookings = new ArrayList<>();

    public BookingController() {
        bookings.add(new Booking(1L, 1L, "Clinic", "CONFIRMED", 15));
        bookings.add(new Booking(2L, 2L, "Bank", "PENDING", 8));
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookings;
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        for (Booking booking : bookings) {
            if (booking.getId().equals(id)) {
                return booking;
            }
        }
        return null;
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        bookings.add(booking);
        return booking;
    }
}