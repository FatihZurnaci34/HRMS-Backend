package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.JobSeekerSkillService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobSeekerSkill;

@RestController
@RequestMapping("/api/jobseekerskill")
public class JobSeekerSkillController {
	
	JobSeekerSkillService jobSeekerSkillService;
	
	@Autowired
	public JobSeekerSkillController(JobSeekerSkillService jobSeekerSkillService) {
		super();
		this.jobSeekerSkillService = jobSeekerSkillService;
	}
	
	
	@GetMapping("/getall")
	
	public DataResult<List<JobSeekerSkill>> getAll(){
		return this.jobSeekerSkillService.getAll();
	}
	
	@GetMapping("/getuserid")
	
	public DataResult<List<JobSeekerSkill>> getByUserId(int id){
		return this.jobSeekerSkillService.getByUserId(id);
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody JobSeekerSkill jobSeekerSkill) {
		return this.jobSeekerSkillService.add(jobSeekerSkill);
	}
	
	@DeleteMapping("/delete")
	
	public Result delete(@RequestBody JobSeekerSkill jobSeekerSkill) {
		return this.jobSeekerSkillService.delete(jobSeekerSkill);
	}

}
