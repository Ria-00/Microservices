package com.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Entity.Flight;

public interface FilghtRepository extends JpaRepository<Flight, Integer>{

	
}
