package com.example.reactiveredisson.controller;

import com.example.reactiveredisson.entity.Booking;
import com.example.reactiveredisson.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/{bookingId}")
    public Mono<ResponseEntity<Booking>> getBooking(@PathVariable String bookingId)
    {
        return this.bookingService.getBooking(bookingId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/entryTTL/{bookingId}")
    public Mono<ResponseEntity<Booking>> getBookingTTL(@PathVariable String bookingId)
    {
        //return bookingService.getBooking(id);
        return this.bookingService.getBookingTTL(bookingId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
