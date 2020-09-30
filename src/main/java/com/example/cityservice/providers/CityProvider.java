package com.example.cityservice.providers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cityservice.db.CityRepository;
import com.example.cityservice.db.entity.City;
import com.example.cityservice.providers.models.CityDto;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CityProvider {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CityRepository cityRepository;
	
	private CityDto convertToDto(City city) {
		return modelMapper.map(city,CityDto.class);
	}
	
	public List<CityDto> getCities() {
		List<City> cities = cityRepository.findAll();
		log.info(String.format("Number of cities in DB: %d",cities.size()));
		return cities.stream().map(this::convertToDto).collect(Collectors.toList()) ;
	}

	public CityDto getCityByName(String name) {
		
		Optional<City> city =  cityRepository.findByName(name);
		
		if ( city.isPresent() ) {
			log.info(String.format("City: %s is in DB",name));
			return convertToDto(city.get());
		}
		
		log.info(String.format("City: %s is NOT in DB",name));
		return null;
	}

	
}
