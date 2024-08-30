package com.Microservices.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Microservices.Entity.Movie;
import com.Microservices.Repository.MovieRepository;

@Controller
public class MovieController {
	
	@Autowired //if you have any object of this type, returns that
	private MovieRepository repo;

	@GetMapping("/getmovies")
	@ResponseBody
	public List<Movie> getAllMovies() {
		Movie m1=new Movie();
		m1.setTitle("La la Land");
		m1.setRating(4.3);
		m1.setReleaseyear(2023);
		
		Movie m2=new Movie();
		m2.setTitle("Zombieland");
		m2.setRating(3.7);
		m2.setReleaseyear(2010);
		
//		return Arrays.asList(m1,m2);
		return repo.findAll();
		
	}
	
	@PostMapping("/addmovie")
	@ResponseBody
	public String addMovie() {
		Movie m2=new Movie();
//		m2.setId(1);
		m2.setTitle("Zombieland");
		m2.setRating(3.7);
		m2.setReleaseyear(2010);
		
		Movie m1=repo.save(m2);
		if (m1 != null) {
			return "Succesfully Added";
		} else {
			return "Error";
		}
		
		
	}
}
