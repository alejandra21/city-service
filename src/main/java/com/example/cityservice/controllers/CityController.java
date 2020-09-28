package com.example.cityservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cityservice.providers.CityProvider;
import com.example.cityservice.providers.models.CityDto;

@RestController
public class CityController {

	@Autowired
	CityProvider cityProvider;
	
    @GetMapping("/bye")
    public String howdy() {
        return "Bye";
    }
    
    @GetMapping("/cities")
    public List<CityDto> getCities() {
        return cityProvider.getCities();
    }
    
}
