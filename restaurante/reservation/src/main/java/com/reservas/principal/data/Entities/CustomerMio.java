package com.reservas.principal.data.Entities;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "Customers")
public class CustomerMio {
    @Id
    public String id;

    public String firstName;
    public String lastName;
}
