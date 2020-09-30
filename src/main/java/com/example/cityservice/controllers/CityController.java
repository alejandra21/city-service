package com.example.cityservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.cityservice.providers.CityProvider;
import com.example.cityservice.providers.models.CityDto;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CityController {

	@Autowired
	CityProvider cityProvider;
	
    @GetMapping("/cities")
    public List<CityDto> getCities() {
    	log.info("We are going to retrieve all cities of DB");
        return cityProvider.getCities();
    }
    
    @GetMapping("/city/{name}")
    public CityDto getCityByName(@PathVariable("name") String name) {
    	log.info(String.format("City to find: %s", name));
        return cityProvider.getCityByName(name);
    }
    
}
