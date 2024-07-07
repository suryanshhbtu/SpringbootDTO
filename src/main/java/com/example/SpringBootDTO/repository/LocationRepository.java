package com.example.SpringBootDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootDTO.Entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
