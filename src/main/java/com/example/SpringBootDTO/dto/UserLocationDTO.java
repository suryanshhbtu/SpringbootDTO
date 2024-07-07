
package com.example.SpringBootDTO.dto;

public class UserLocationDTO {

	private Long userID;
	private String email;
	private String place;
	private double latitude;
	private double longitude;
	@Override
	public String toString() {
		return "UserLocationDTO [userID=" + userID + ", email=" + email + ", place=" + place + ", latitude=" + latitude
				+ ", longitude=" + longitude + "]";
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
}
