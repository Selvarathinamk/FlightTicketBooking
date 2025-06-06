package com.example.FlightTicket.Controller;

import com.example.FlightTicket.model.BookedFlight;
import com.example.FlightTicket.model.FlightDetails;
import com.example.FlightTicket.service.Flightser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class Flightcon {
    @Autowired
    Flightser Fs;
    @GetMapping("FlightDetails")
    public List<FlightDetails> details(){
        return Fs.details();
    }
    @GetMapping("Flight/bookedflight")
    public List<BookedFlight> bookedFlights(){
        return Fs.bookedflight();
    }
    @PostMapping("/Flight/register")
    public void register(@RequestParam("name") String name,@RequestParam("Email")String Email,@RequestParam("location")String location,@RequestParam("Destination")String Destination,@RequestParam("Flightname")String Flightname,@RequestParam("Flightno")int Flightno){
        Fs.register(name,Email,location,Destination,Flightname,Flightno);

    }
}
