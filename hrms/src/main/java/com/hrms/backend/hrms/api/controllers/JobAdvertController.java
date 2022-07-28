package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.JobAdvertService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("api/jobadvert")
public class JobAdvertController {
	
	private JobAdvertService jobAdvertService;

	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}

	
	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll(){
		return this.jobAdvertService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}
	
	
}
