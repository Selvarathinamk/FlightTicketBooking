package com.example.FlightTicket.service;

import com.example.FlightTicket.model.BookedFlight;
import com.example.FlightTicket.model.FlightDetails;
import com.example.FlightTicket.repository.Flightrepo;
import com.example.FlightTicket.repository.bookedrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Flightser {
    @Autowired
     Flightrepo Fr;
    @Autowired
     bookedrepo br;
    public List<FlightDetails> details() {
        return Fr.findAll();
    }

    public List<BookedFlight> bookedflight() {
        return br.findAll();
    }

    public void register(String name, String Email, String location, String Destination, String Flightname, int Flightno) {
        BookedFlight BookedFlight=new BookedFlight(name,Email,location,Destination,Flightname,Flightno);
        br.save(BookedFlight);
    }
}
