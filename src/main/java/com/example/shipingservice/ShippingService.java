package com.example.shipingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingService {

    @GetMapping("/ship")
    public String ship() {
        return "Ship Service !";
    }
}
