package com.vaghelmt.store.controller;

import com.vaghelmt.store.entity.Customer;
import com.vaghelmt.store.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> all(){
        return customerRepository.findAll();
    }
}
