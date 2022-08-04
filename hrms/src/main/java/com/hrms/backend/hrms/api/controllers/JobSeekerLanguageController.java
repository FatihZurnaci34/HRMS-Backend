package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.JobSeekerLanguageService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobSeekerLanguage;

@RestController
@RequestMapping("/api/jobseekerlanguage")
public class JobSeekerLanguageController {
	
	JobSeekerLanguageService jobSeekerLanguageService;

	@Autowired
	public JobSeekerLanguageController(JobSeekerLanguageService jobSeekerLanguageService) {
		super();
		this.jobSeekerLanguageService = jobSeekerLanguageService;
	}
	
	
	@GetMapping("/getall")
	
	public DataResult<List<JobSeekerLanguage>> getAll(){
		return this.jobSeekerLanguageService.getAll();
	}
	
	@GetMapping("/getbyuserid")
	
	public DataResult<List<JobSeekerLanguage>> getByUserId(int id){
		return this.jobSeekerLanguageService.getByUserId(id);
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody JobSeekerLanguage jobSeekerLanguage) {
		return this.jobSeekerLanguageService.add(jobSeekerLanguage);
		
	}
	
	@DeleteMapping("/delete")
	
	public Result delete(@RequestBody JobSeekerLanguage jobSeekerLanguage) {
		
		return this.jobSeekerLanguageService.delete(jobSeekerLanguage);
	}

}
