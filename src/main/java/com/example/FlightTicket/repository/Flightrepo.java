package com.example.FlightTicket.repository;

import com.example.FlightTicket.model.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Flightrepo extends JpaRepository<FlightDetails,Integer> {
}
