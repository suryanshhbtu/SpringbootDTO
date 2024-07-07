package com.example.SpringBootDTO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootDTO.dto.UserLocationDTO;
import com.example.SpringBootDTO.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user-loc")
	public List<UserLocationDTO> getAllUsersLocation(){
		return userService.getAllUsersLocation();
	}
}
