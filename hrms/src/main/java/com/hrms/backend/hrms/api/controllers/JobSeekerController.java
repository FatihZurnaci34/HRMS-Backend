package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.JobSeekerService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/candidates")
public class JobSeekerController {
	
	private JobSeekerService candidateService;

	@Autowired
	public JobSeekerController(JobSeekerService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	
	@GetMapping("/getall")
	
	public DataResult<List<JobSeeker>> getAll(){
		return this.candidateService.getAll();
	}
	
	@PostMapping("/add")
	
	public Result getAll(@RequestBody JobSeeker candidate) {
		return this.candidateService.add(candidate);
		
	}
	

}
