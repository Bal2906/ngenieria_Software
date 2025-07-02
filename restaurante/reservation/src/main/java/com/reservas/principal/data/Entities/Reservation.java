package com.reservas.principal.data.Entities;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document(collection = "Reservations")
public class Reservation {
    @Id
    String id;
    String idCustomer;
    Integer tablenumber;
    Long reservationDate;
    String notes;
    String status;
}
