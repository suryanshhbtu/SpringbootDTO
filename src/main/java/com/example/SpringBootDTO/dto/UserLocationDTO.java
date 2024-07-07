
package com.example.SpringBootDTO.dto;

import lombok.Data;

@Data
public class UserLocationDTO {

	private String userID;
	private String email;
	private String place;
	private double latitude;
	private double longitude;
}
