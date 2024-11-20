package com.Springboot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Springboot.Entity.AadharCard;
import com.Springboot.Entity.School;
import com.Springboot.Entity.Student;
import com.Springboot.Entity.Subject;
import com.Springboot.Repository.SchoolRepository;
import com.Springboot.Repository.StudentRepository;

@SpringBootApplication
public class SpringBootDepApplication implements CommandLineRunner{

	
	@Autowired
	private StudentRepository student_repo;
	
	@Autowired
	private SchoolRepository scl_repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDepApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		saveStudent();
		
	}
	
	void saveStudent() {
		School sch=new School();
		sch.setName("KV");

		Student s1=new Student();
		Student s2=new Student();
		
		AadharCard a1=new AadharCard();
		AadharCard a2=new AadharCard();
		
		Subject sub1=new Subject();
		Subject sub2=new Subject();
		Subject sub3=new Subject();
		Subject sub4=new Subject();
		
		
		sub1.setName("English");
		sub2.setName("Hindi");
		sub3.setName("Maths");
		sub4.setName("SST");
		
		Set<Subject> subjects = new HashSet<>();

		subjects.add(sub1);  
		subjects.add(sub2);  
		subjects.add(sub3);  
		subjects.add(sub4);  
		
		Set<Subject> subjectsLana = new HashSet<>();

		subjectsLana.add(sub1);  
		subjectsLana.add(sub3);  
		subjectsLana.add(sub4);  
		
		a1.setAdhar_num(765766743);
		a1.setAddress("Noida");
		a1.setS(s1);
		
		a2.setAdhar_num(823486278);
		a2.setAddress("Delhi");
		a2.setS(s2);
		
		s1.setAadhar(a1);
		s1.setAge(16);
		s1.setName("Neil");
		s1.setSub(subjects);
		
		s2.setAadhar(a2);
		s2.setAge(15);
		s2.setName("Lana");
		s2.setSub(subjectsLana);
		
		sub1.setStudents(Arrays.asList(s1,s2));
		sub2.setStudents(Arrays.asList(s1));
		sub3.setStudents(Arrays.asList(s1,s2));
		sub4.setStudents(Arrays.asList(s1,s2));
		sch.setStudents(Arrays.asList(s1,s2));
		
		s1.setScl(sch);
		s2.setScl(sch);
		
		scl_repo.save(sch);
//		student_repo.save(s2);
	}

}
