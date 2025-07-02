package com.reservas.principal.logic;

import com.reservas.principal.data.Entities.Reservation;
import com.reservas.principal.data.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class ReservationUC {
    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation createReservation(String idCustomer, Integer tableNumber, LocalDateTime reservationDate, String notes) {
        var reservation = reservationRepository.insert(Reservation.builder()
                .idCustomer(idCustomer)
                .tablenumber(tableNumber)
                .reservationDate(reservationDate
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate()
                        .toEpochDay())
                .notes(notes)
                .status("No confirmed").build());
        reservation = reservationRepository.insert(reservation);
        return reservation;
    }


}
