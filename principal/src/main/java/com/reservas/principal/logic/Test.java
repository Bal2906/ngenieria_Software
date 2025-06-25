package com.reservas.principal.logic;

import com.reservas.principal.data.Entities.CustomerMio;
import com.reservas.principal.data.repositories.CustomerMioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class Test {

    @Autowired
    CustomerMioRepository customerMioRepository;

    public CustomerMio insertCustomer(String id, String firstName, String lastName) {
    var user = customerMioRepository.insert(new CustomerMio(id, firstName, lastName));
    return user;
    }

    public List<CustomerMio> findAllCustomers() {
        return customerMioRepository.findAll();
    }

    public CustomerMio getCustomerByName(String name) {
        return customerMioRepository.getCustomerByName(name);
    }
}
