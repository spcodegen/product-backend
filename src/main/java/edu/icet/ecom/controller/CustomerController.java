package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {

    @GetMapping("/search-customer/{nic}")
    Customer searchCustomer(@PathVariable String nic) {
        return null;
    }

    @GetMapping("/search-customer")
    Customer searchCustomerV2(@RequestParam(name = "nic") String nic, @RequestParam(name = "name") String name) {
        System.out.println(nic);
        System.out.println(name);
        return null;
    }
}
