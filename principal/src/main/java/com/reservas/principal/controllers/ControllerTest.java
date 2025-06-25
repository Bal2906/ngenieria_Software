package com.reservas.principal.controllers;

import com.reservas.principal.data.Entities.CustomerMio;
import com.reservas.principal.logic.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.beans.Customizer;
import java.util.List;

@RestController
public class ControllerTest {

    @Autowired
    Test test;

    @GetMapping("/test")
    public CustomerMio insertCustomer(@RequestParam("id") String id, @RequestParam("name") String name, @RequestParam("lastName") String lastName) {
        return test.insertCustomer(id, name, lastName);

    }

    @GetMapping("/getAllCustomers")
    public List<CustomerMio> getAllCustomers() {
        return test.findAllCustomers();
    }

    @GetMapping("/getCustomers")
    public CustomerMio getAllCustomersByName(@RequestParam("name") String name) {
        return test.getCustomerByName(name);
    }

    @GetMapping("/getCustomers/{name}")
    public CustomerMio getAllCustomersByName1(@PathVariable String name) {
        return test.getCustomerByName(name);
    }

}
