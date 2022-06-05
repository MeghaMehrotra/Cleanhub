package com.cleanhub.api.controllers;

import com.cleanhub.api.entity.Customer;
import com.cleanhub.api.exception.CleanhubMessageException;
import com.cleanhub.api.services.interfaces.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    ICustomerService customerService;

    @GetMapping
    Page<Customer> fetchCustomers(@RequestParam(name="limit") Integer limit) {
        log.info("Fetching "+limit+"Customers by increase in Quantity");

        Page<Customer> customers = null;
         if(limit != null){
           customers =  customerService.fetchTopXCustomerByQuantity(limit);
         }
         if(customers != null){
             log.info("Returning customers..with size"+customers.getSize());
         }
       return customers;
    }
}
