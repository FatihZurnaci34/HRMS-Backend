package com.hrms.backend.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.backend.hrms.business.abstracts.JobSeekerLanguageService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.backend.hrms.core.utilities.results.SuccessResult;
import com.hrms.backend.hrms.dataAccess.abstracts.JobSeekerLanguageDao;
import com.hrms.backend.hrms.entities.concretes.JobSeekerLanguage;

@Service
public class JobSeekerLanguageManager implements JobSeekerLanguageService{
	
	JobSeekerLanguageDao jobSeekerLanguageDao;

	@Autowired
	public JobSeekerLanguageManager(JobSeekerLanguageDao jobSeekerLanguageDao) {
		super();
		this.jobSeekerLanguageDao = jobSeekerLanguageDao;
	}

	@Override
	public DataResult<List<JobSeekerLanguage>> getAll() {
		return new SuccessDataResult<List<JobSeekerLanguage>>(this.jobSeekerLanguageDao.findAll(),"İş Arayanların Dilleri Listelendi");
	}

	@Override
	public DataResult<List<JobSeekerLanguage>> getByUserId(int id) {
		return new SuccessDataResult<List<JobSeekerLanguage>>(this.jobSeekerLanguageDao.getByUserId(id));
	}

	@Override
	public Result add(JobSeekerLanguage jobSeekerLanguage) {
		this.jobSeekerLanguageDao.save(jobSeekerLanguage);
		return new SuccessResult("İş arayanın dili eklendi");
	}

	@Override
	public Result delete(JobSeekerLanguage jobSeekerLanguage) {
		this.jobSeekerLanguageDao.save(jobSeekerLanguage);
		return new SuccessResult("İş arayanın dili silindi");
	}
	
	

}
