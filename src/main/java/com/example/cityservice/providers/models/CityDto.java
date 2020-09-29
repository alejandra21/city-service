package com.example.cityservice.providers.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CityDto {
    private Long id;
    @JsonProperty("cityOrigin")
    private String name;
    private List<ConnectionsDto> connections = new ArrayList<>();
}
