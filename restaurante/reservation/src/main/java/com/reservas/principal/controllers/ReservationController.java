package com.reservas.principal.controllers;

import com.reservas.principal.logic.ReservationUC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ReservationController {

    @Autowired
    private ReservationUC reservationUC;

    @GetMapping("/createReservation")
    public String createReservation(
            @RequestParam("customer") String customerId,
            @RequestParam("table") Integer tablenumber,
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime reservationDate,
            @RequestParam(name = "note", required = false) String notes) {

        var reservation = reservationUC.createReservation(
                customerId,
                tablenumber,
                reservationDate,
                notes);

        return "Reservation created with id: " + reservation.getId();
    }
}
