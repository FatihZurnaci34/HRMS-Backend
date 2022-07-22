package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.PersonService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.Person;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	private PersonService personService;

	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Person>> getAll(){
		return this.personService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Person person) {
		return this.personService.getAll(person);
	}
	

}
