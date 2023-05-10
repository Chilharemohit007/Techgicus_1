package com.techgicus_Grp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techgicus_Grp.entities.Interns;
import com.techgicus_Grp.repositories.InternsRepository;

@RestController
//@RestController - It helps us to defines the RestFull Layer of our project OR this deals with WEBSERVICES 
//@Controller - It defines the Controller layer of the Project Responsible to interact with the View and the BackEnd Business Logic.
@RequestMapping("/interns")
public class InternsRestController1 {
	
	@Autowired
	private InternsRepository internsRepo;
	
	@GetMapping
	//Reading the data	@GetMapping Will gets a data from DataBase puts that into JSON Object.
	public List<Interns> getAllInterns(){
		List<Interns> interns = internsRepo.findAll();
		return interns;
	}
	@PostMapping
	//Save the data		@PostMapping Takes the JSON Objects contains and Puts that into the database.
	public void saveInterns(@RequestBody Interns interns) { //@RequestBody -The Purpose of this annotation is, whatever the Contents Of JSON Object are converted into Java Object.
		internsRepo.save(interns);
	}
	
	@PutMapping
	//Updating the data	@PutMapping Updates the data in the database using the WebServices. 
	public void updateInterns(@RequestBody Interns interns) { //@RequestBody -The Purpose of this annotation is, whatever the Contents Of JSON Object are converted into Java Object.
		internsRepo.save(interns);
	}
	
	@DeleteMapping("/delete/{id}")
	//path variable will read the value from webServices URL and MAPs WebServices Method Argument & 
								//REQUESTPARAM will read the value from Ordinary URLs.
	//@DeleteMapping Deletes the record in the database using webServices. 
	public void deleteInterns(@PathVariable("id") long id) {
		internsRepo.deleteById(id);
		
	}
}
