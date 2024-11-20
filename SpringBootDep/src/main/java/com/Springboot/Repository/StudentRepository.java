package com.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
