package com.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
