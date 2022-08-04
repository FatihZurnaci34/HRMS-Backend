package com.hrms.backend.hrms.business.abstracts;

import java.util.List;

import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobSeekerSkill;

public interface JobSeekerSkillService {
	
	Result add(JobSeekerSkill jobSeekerSkill);
	
	Result delete(JobSeekerSkill jobSeekerSkill);
	
	DataResult<List<JobSeekerSkill>> getAll();
	
	DataResult<List<JobSeekerSkill>> getByUserId(int id);

}
