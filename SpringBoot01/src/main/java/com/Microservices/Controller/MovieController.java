package com.Microservices.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Microservices.Entity.Movie;
import com.Microservices.Repository.MovieRepository;

//@CrossOrigin("*")  // allows all
@CrossOrigin(origins= {"https://hoppscotch.io/"})
//@Controller
//@ResponseBody
@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
	
	@Autowired //if you have any object of this type, returns that
	private MovieRepository repo;

	@GetMapping("")
//	@ResponseBody
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
	
	@PostMapping("")
//	@ResponseBody
	public String addMovie(@RequestBody Movie m) {
//		Movie m2=new Movie();
//		m2.setId(1);
//		m2.setTitle("Zombieland");
//		m2.setRating(3.7);
//		m2.setReleaseyear(2010);
		
		Movie m1=repo.save(m);
		if (m1 != null) {
			return "Succesfully Added";
		} else {
			return "Error";
		}	
	}
	
	@GetMapping("/{id}")
//	@ResponseBody
	public Movie findById(@PathVariable int id) {		
		Optional<Movie> optional=repo.findById(id);
		if(optional.isEmpty()) {
			throw new RuntimeException("Id "+id+" not found"); //By default goes to Spring Class Exceptionhandle. Just throw any error, Spring will handle it.
		}
		else {
			return optional.get();
		}
	}
	
	@DeleteMapping("/{id}")
//	@ResponseBody
	public String deleteMovie(@PathVariable int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Succesfully Deleted";
		}
		throw new RuntimeException("Id "+id+" not found");
	}
	
	@PutMapping("/{id}")
//	@ResponseBody
	public Movie updateMovie(@RequestBody Movie m,@PathVariable int id) {
		if(repo.existsById(id)) {
			Movie m1=findById(id);
			if (m.getTitle()!=null) {
				m1.setTitle(m.getTitle());
			}
			if (m.getRating()>0) {
				m1.setRating(m.getRating());
			}
			if (m.getReleaseyear()>0) {
				m1.setReleaseyear(m.getReleaseyear());
			}
			
			return repo.save(m1);
		}
		throw new RuntimeException("Id "+id+" not found");
	}
	
}
