package com.example.cityservice.providers.models;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ConnectionsDto {

	private Date arrival;
	private Date departure;
	@JsonProperty("cityDestination")
	private String connectionIdCityDestinationName;
	
	public Long getTotalTime() {
		
		long substraction = arrival.getTime() - departure.getTime();
		
		if ( substraction < 0 ) {
			return 0L;
		}
		
	    long diffInMillies = Math.abs(substraction);
	    return TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		
	}
	
}
