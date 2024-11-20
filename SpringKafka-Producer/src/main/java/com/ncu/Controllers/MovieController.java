package com.ncu.Controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.Models.Movie;


@RestController()
@RequestMapping("movie")
public class MovieController {
	
	@Autowired
	private KafkaTemplate<String, Movie> kafkatemp;
	
	private static final String TOPIC = "kafka_rio";

	
	@PostMapping("/upload_demo")
	public String uploadDemo() {
		int id = (int)(Math.floor(Math.random()*100));
		kafkatemp.send(TOPIC,new Movie(id,"Fight Club",4.9,2009));
		return "Successfully added default movie at: "+LocalDateTime.now();
	}
	
	@PostMapping("/upload")
	public String upload(@RequestBody Movie movie) {
		kafkatemp.send(TOPIC,new Movie(movie.getId(),movie.getTitle(),movie.getRating(),movie.getReleaseyear()));
		return "Successfully added "+movie.getTitle()+" at: "+LocalDateTime.now();
	}
}
