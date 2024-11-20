package com.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
