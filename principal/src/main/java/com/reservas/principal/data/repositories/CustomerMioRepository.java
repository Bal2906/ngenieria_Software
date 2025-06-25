package com.reservas.principal.data.repositories;

import com.reservas.principal.data.Entities.CustomerMio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerMioRepository extends MongoRepository<CustomerMio, String> {

    @Query("{ firstName : '?0' }")
    public CustomerMio getCustomerByName(String name);
}
