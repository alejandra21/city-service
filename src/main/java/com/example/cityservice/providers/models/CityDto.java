package com.example.cityservice.providers.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CityDto {
    private Long id;
    private String name;
    private List<ConnectionsDto> connections = new ArrayList<>();
}
