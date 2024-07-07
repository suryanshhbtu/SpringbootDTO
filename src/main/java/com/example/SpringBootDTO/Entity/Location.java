package com.example.SpringBootDTO.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", place=" + place + ", description=" + description + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Location(long id, String place, String description, double latitude, double longitude) {
		super();
		this.id = id;
		this.place = place;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
