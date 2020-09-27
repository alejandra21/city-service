package com.example.cityservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @GetMapping("/bye")
    public String howdy() {
        return "Bye";
    }
    
}
