package com.Microservices.Controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Microservices.Entity.Flight;

@Controller
public class FlightController {
	
	static HashMap<String, Flight> flights=new HashMap<>();
	
	@PostMapping("/addflight")
	@ResponseBody
	public String insertFlight(@RequestBody Flight flight) {
		String id=flight.getId();
		System.out.println(flight);
		Flight res=flights.put(id, flight);
		System.out.println(flights);
		if( res != null) {
			return "Filght with id already exists!";
		}
		else {
			return "Successfully added!";
		}
		
	}
	
	@GetMapping("/getflight")
	@ResponseBody
	public String flightInfo(@RequestBody String id) {
		if (flights.containsKey(id)) {
			Flight flight=flights.get(id);
			return "WELCOME TO EMIRATES\n\nFrom:" + flight.getSource() + "\nTo:" + flight.getDest() + "\nAvailable Seats:"
					+ flight.getAvail_seats() + "\nPrice:" + flight.getPrice();
			
		} else {
			return "No such flight exists!";
		}
		
	}
	
	@PostMapping("/removeflight")
	@ResponseBody
	public String deleteFlight(@RequestBody String id) {
		if (flights.containsKey(id)) {
			flights.remove(id);
			return "Successfully removed!";
			
		} else {
			return "No such flight exists!";
		}
	}
}
