package com.example.cityservice.db.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.hibernate.annotations.Check;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
@Check(constraints = "city_origin_id != city_destination_id and arrival >= departure")
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
