package com.example.SpringBootDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBootDTO.Entity.Location;
import com.example.SpringBootDTO.Entity.User;
import com.example.SpringBootDTO.repository.LocationRepository;
import com.example.SpringBootDTO.repository.UserRepository;

@SpringBootApplication
public class SpringBootDtoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	public void run(String... args) throws Exception{
		Location l = new Location();
		l.setPlace("Gurgoan");
		l.setDescription("Very Expencive Place");
		l.setLatitude(40.5);
		l.setLongitude(49.5);
		locationRepository.save(l);

		User u = new User();
		u.setFirstName("Suryansh");
		u.setLastName("Srivastava");
		u.setEmail("suryanshhbtu@gmail.com");
		u.setPassword("xxx");
		u.setLocation(l);
		userRepository.save(u);
		
		User v = new User();
		v.setFirstName("Shashank");
		v.setLastName("Srivastava");
		v.setEmail("shashank@gmail.com");
		v.setPassword("xxx");
		v.setLocation(l);
		userRepository.save(v);
	}

}
