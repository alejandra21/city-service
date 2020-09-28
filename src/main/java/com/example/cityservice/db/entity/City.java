package com.example.cityservice.db.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity
public class City  implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public City(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    @Column(unique=true)
    private String name;
    
    @OneToMany(mappedBy = "connectionId.cityOrigin", fetch = FetchType.LAZY)
    private List<CitiesConnection> connections = new ArrayList<>();
    
}

