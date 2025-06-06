package com.example.FlightTicket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookedFlight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String Email;
    private String location;
    private String Destination;
    private String Flightname;
    private int Flightno;

    public BookedFlight(String name, String Email, String location, String Destination, String Flightname, int Flightno) {
        this.name = name;
       this.Email = Email;
        this.location = location;
       this.Destination = Destination;
       this.Flightname = Flightname;
       this.Flightno = Flightno;
    }
}
