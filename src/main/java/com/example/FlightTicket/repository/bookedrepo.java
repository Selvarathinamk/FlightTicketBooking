package com.example.FlightTicket.repository;

import com.example.FlightTicket.model.BookedFlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookedrepo extends JpaRepository<BookedFlight,Integer> {
}
