package com.flightsnatcher.service.domain.models;

import lombok.Data;

import java.util.List;

@Data
public class Airline {

    String name;

    List<Airport> accessibleAirports;

}
