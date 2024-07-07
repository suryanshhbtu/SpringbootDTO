package com.example.SpringBootDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootDTO.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
