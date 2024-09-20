package com.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
