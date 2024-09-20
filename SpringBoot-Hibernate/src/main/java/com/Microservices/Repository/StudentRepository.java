package com.Microservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Microservices.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
