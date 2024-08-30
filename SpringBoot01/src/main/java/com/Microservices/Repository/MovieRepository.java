package com.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Microservices.Entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>{
	
	//No need to write repetitive methods, Spring Boot does that for you.
	// Just implement the interface and call the methods.

}
