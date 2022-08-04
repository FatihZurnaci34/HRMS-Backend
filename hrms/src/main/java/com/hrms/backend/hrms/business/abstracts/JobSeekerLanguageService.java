package com.hrms.backend.hrms.business.abstracts;

import java.util.List;

import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobSeekerLanguage;

public interface JobSeekerLanguageService {
	
	DataResult<List<JobSeekerLanguage>> getAll();
	
	DataResult<List<JobSeekerLanguage>> getByUserId(int id);
	
	Result add(JobSeekerLanguage jobSeekerLanguage);
	
	Result delete(JobSeekerLanguage jobSeekerLanguage);

}
