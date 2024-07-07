package com.example.SpringBootDTO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootDTO.Entity.User;
import com.example.SpringBootDTO.dto.UserLocationDTO;
import com.example.SpringBootDTO.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserLocationDTO> getAllUsersLocation() {
		
		return userRepository.findAll()
				.stream()
				.map(this::convertEntityToDTO)
				.collect(Collectors.toList());
	}

	public UserLocationDTO convertEntityToDTO(User user) {

		UserLocationDTO userLocationDTO = new UserLocationDTO();
		userLocationDTO.setUserID(user.getId());
		userLocationDTO.setEmail(user.getEmail());
		userLocationDTO.setPlace(user.getLocation().getPlace());
		userLocationDTO.setLongitude(user.getLocation().getLongitude());
		userLocationDTO.setLatitude(user.getLocation().getLatitude());
		
		return userLocationDTO;
	}

}
