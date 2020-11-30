package com.flightsnatcher.service.domain.models;

import lombok.Data;

import java.util.List;

@Data
public class Airport {

    String code;

    Country country;

    List<Airline> hostedAirlines;
}
