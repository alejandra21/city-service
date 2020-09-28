package com.example.cityservice.db.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
public class CitiesConnection {

    @EmbeddedId
    private ConnectionId connectionId;
		
	@NonNull
	private Date departure;
	
	@NonNull
	private Date arrival;
	
}
