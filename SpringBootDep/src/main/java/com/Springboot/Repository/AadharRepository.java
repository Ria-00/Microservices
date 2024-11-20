package com.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Entity.AadharCard;

public interface AadharRepository extends JpaRepository<AadharCard, Integer> {

}
