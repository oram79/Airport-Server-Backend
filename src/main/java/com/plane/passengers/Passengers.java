package com.plane.passengers;

import com.plane.aircraft.Aircraft;
import jakarta.persistence.*;

@Entity
public class Passengers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerId;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "aircraft_id")
    private Aircraft airline;

    public Passengers() {

    }

    public Passengers(String name, String email, Aircraft airline) {
        this.name = name;
        this.email = email;
        this.airline = airline;
    }

    public Long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Long passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Aircraft getAircraft() {
        return airline;
    }

    public void setAircraft(Aircraft airline) {
        this.airline = airline;
    }
}

