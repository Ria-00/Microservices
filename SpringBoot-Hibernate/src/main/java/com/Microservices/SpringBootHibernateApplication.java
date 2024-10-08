package com.Microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Microservices.Entity.Address;
import com.Microservices.Entity.AdharCard;
import com.Microservices.Entity.Customer;
import com.Microservices.Entity.Flight;
import com.Microservices.Entity.Person;
import com.Microservices.Entity.Pilot;
import com.Microservices.Repository.AdharRepository;
import com.Microservices.Repository.CustomerRepository;
import com.Microservices.Repository.FilghtRepository;
import com.Microservices.Repository.PersonRepository;
import com.Microservices.Repository.SchoolRepository;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner{

	@Autowired
	private FilghtRepository repo;
	
	@Autowired
	private CustomerRepository customer_repo;
	
	@Autowired
	private PersonRepository person_repo;
	
	@Autowired
	private AdharRepository adhar_repo;
	
	@Autowired
	private SchoolRepository scl_repo;
	
	
	// responsibility only to start applictaion. Can write saving code here, but not advised
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
			
	}

	
	// This is the method called next to actually starting the applictaion.(After main)
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		saveFlight();
//		saveCustomer();
//		savePerson();
		
	}
	
	public void saveFlight() {
		Pilot p=new Pilot();
		p.setName("Maverick");
		p.setAge(26);
		Flight f=new Flight();
		f.setPilot(p);
		f.setId(11);
		f.setAvail_seats(345);
		f.setDest("Colorado");
		f.setSource("New Havens");
		f.setPrice(3455.67);
		repo.save(f);
	}
	
	public void saveCustomer() {
		Address cur=new Address();
		cur.setCity("Gurugram");
		cur.setState("Haryana");
		cur.setStreet("C-24");
		cur.setZipcode(122017);
		
		Address per=new Address();
		per.setCity("Noida");
		per.setState("New Delhi");
		per.setStreet("H-13");
		per.setZipcode(122011);
		
		Customer c=new Customer();
		c.setCurrent_address(cur);
		c.setPermanent_address(per);
		c.setAge(23);
		c.setName("Pionee");
		c.setPhn(73640276);
		c.setSsn(567);
		
		customer_repo.save(c);
	}
	
	public void savePerson() {
		Person p=new Person();
		AdharCard ac=new AdharCard();
		
		p.setName("Vedh");
		p.setAge(22);
		p.setId(67);
		ac.setP(p);
		
		ac.setAdhar_num(564378263L);
		ac.setAddress("Hyderabad");
		p.setAd_num(ac);
		
		adhar_repo.save(ac);
		person_repo.save(p);
		
	}
	
	public void saveStudent() {
		
	}

}
