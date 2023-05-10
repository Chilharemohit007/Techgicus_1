package com.techgicus_Grp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techgicus_Grp.entities.Interns;
import com.techgicus_Grp.repositories.InternsRepository;

@RestController
public class InternsRestController {

	@Autowired
	private InternsRepository internsRepo;
	
	@RequestMapping("/interns/{id}")	// Rest Controller supports only PathVariable 
	public Interns getInterns(@PathVariable("id") long id) {
		Optional<Interns> findById = internsRepo.findById(id);
		Interns interns = findById.get();
		return interns;
	}
}
