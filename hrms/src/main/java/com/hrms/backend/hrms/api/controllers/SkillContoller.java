package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.SkillService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skill")
public class SkillContoller {
	
	private SkillService skillService;
	
	@Autowired
	public SkillContoller(SkillService skillService) {
		super();
		this.skillService = skillService;
	}

	@GetMapping("/getall")
	
	public DataResult<List<Skill>> getAll() {
		return this.skillService.getAll();
	}
	
	@PostMapping("/add")
	
	public Result add(@RequestBody Skill skill) {
		
		return this.skillService.add(skill);
		
	}

}
