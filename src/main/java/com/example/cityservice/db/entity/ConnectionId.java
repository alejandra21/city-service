package com.example.cityservice.db.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Embeddable
public class ConnectionId implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch=FetchType.LAZY)
	@NonNull
	private City cityOrigin;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@NonNull
	private City cityDestination;

}
