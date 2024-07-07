package com.example.SpringBootDTO.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // creating getter, setter, toString, etc.
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="locations")
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="place")
	private String place;
	
	private String description;
	
	private double latitude;
	private double longitude;
	
}
