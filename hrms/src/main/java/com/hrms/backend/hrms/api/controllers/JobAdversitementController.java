package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.JobAdversitementService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("api/jobadversitement")
public class JobAdversitementController {
	
	private JobAdversitementService jobAdversitementService;
	
	@Autowired
	public JobAdversitementController(JobAdversitementService jobAdversitementService) {
		super();
		this.jobAdversitementService = jobAdversitementService;
	}


	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdversitementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement advertisement) {
		return this.jobAdversitementService.add(advertisement);
	}

}
