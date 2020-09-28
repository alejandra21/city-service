package com.example.cityservice.providers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cityservice.db.CityRepository;
import com.example.cityservice.db.entity.City;
import com.example.cityservice.providers.models.CityDto;

@Component
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
		return cities.stream().map(this::convertToDto).collect(Collectors.toList()) ;
	}

	
}
