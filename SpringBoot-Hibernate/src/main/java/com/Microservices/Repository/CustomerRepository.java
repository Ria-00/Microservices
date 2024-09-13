package com.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
