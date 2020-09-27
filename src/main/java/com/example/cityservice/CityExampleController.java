package com.example.cityservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityExampleController {

    @GetMapping("/home")
    public String howdy() {
        return "Hello";
    }
	
}
