package com.flightsnatcher.service.domain.models;

import lombok.Data;

@Data
public class Ticket {

    String id;

    Long cost;

    Flight flight;

    Snatcher user;

}
