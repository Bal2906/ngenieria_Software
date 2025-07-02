package com.reservas.principal.data.repositories;

import com.reservas.principal.data.Entities.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
    @Query("{ 'id' : '?0' }")
    public Reservation getReservationById(String id);
}
