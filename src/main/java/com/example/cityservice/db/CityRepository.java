package com.example.cityservice.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cityservice.db.entity.City;

public interface CityRepository  extends JpaRepository<City, Long>{

}
