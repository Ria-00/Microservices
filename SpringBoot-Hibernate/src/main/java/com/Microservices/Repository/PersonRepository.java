package com.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
