package com.example.cityservice.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cityservice.db.entity.City;
import com.example.cityservice.providers.models.CityDto;

public interface CityRepository  extends JpaRepository<City, Long>{

	Optional<CityDto> findByName(String name);

}
