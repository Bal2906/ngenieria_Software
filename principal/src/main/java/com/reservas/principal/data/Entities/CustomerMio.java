package com.reservas.principal.data.Entities;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Customers")
public class CustomerMio {
    @Getter
    @Id
    public String id;

    @Getter
    @Setter
    public String firstName;

    @Getter
    @Setter
    public String lastName;
}
