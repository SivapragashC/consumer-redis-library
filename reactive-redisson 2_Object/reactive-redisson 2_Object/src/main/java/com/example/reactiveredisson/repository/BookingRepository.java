package com.example.reactiveredisson.repository;


import com.example.reactiveredisson.entity.Booking;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends ReactiveCrudRepository<Booking, String> {
}
