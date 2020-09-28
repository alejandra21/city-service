package com.example.cityservice.db.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
public class CitiesConnection {

    @Id
    @GeneratedValue
    private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@NonNull
	City cityOrigin;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@NonNull
	City cityDestination;
	
	@NonNull
	Date departure;
	
	@NonNull
	Date arrival;
	
}
