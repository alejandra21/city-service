package com.example.cityservice.db.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
public class CitiesConnection implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
    private ConnectionId connectionId;
		
	@NonNull
	private Date departure;
	
	@NonNull
	private Date arrival;
	
}
