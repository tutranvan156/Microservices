package com.customer.controller;

import com.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers/")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("get-all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(this.customerRepository.findAll(), HttpStatus.OK);
    }
}
