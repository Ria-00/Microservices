package com.ncu.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.Models.Show;

@RestController
@RequestMapping("/book/api")
public class DemoController {

	@GetMapping("/shows")
	public List<Show> getDefaultShows() {
		List<Show> shows = new ArrayList<Show>();
		shows.add(new Show("Grey's Anatomy", "Michael Stakes", 4.9));
		shows.add(new Show("Penguin", "David Beckens", 4.7));
		return shows;
	}

}
