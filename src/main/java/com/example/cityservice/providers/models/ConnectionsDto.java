package com.example.cityservice.providers.models;

import java.util.Date;

import lombok.Data;

@Data
public class ConnectionsDto {

	private Date arrival;
	private Date departure;
	private String cityDestinationName;
	
}
