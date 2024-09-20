package com.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Entity.AdharCard;

public interface AdharRepository extends JpaRepository<AdharCard, Long> {

}
