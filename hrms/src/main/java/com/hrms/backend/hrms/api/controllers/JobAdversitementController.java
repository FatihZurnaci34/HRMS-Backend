package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdversitementService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement advertisement) {
		return this.jobAdversitementService.add(advertisement);
	}

	@GetMapping("/getactiveadversitements")

	public DataResult<List<JobAdvertisement>> getActiveAdvertisements() {
		return this.jobAdversitementService.getActiveAdvertisements();
	}
	
	@PostMapping("/advertisementActiveTrue")
	
	public Result advertisementActiveTrue(@RequestParam int id){
		return this.jobAdversitementService.adversitementActiveTrue(id);
	}
	
	@PostMapping("/advertisementActiveFale")
	
	public Result advertisementActiveFalse(@RequestParam int id) {
		return this.jobAdversitementService.adversitementActiveFalse(id);
	}
	
	@GetMapping("/getActiveAdvertisementsByEmployer")
	
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsByEmployer(@RequestParam int employerId){
		return this.jobAdversitementService.getActiveAdvertisementsByEmployer(employerId);
	}

	@GetMapping("/getActiveAdvertisementsByDeadlineAsc")

	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsByDeadlineAsc() {
		return this.jobAdversitementService.getActiveAdvertisementsByDeadlineAsc();
	}

	@GetMapping("/getActiveAdvertisementsByDeadlineDesc")

	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsByDeadlineDesc() {
		return this.jobAdversitementService.getActiveAdvertisementsByDeadlineDesc();
	}

}
