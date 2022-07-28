package com.hrms.backend.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.backend.hrms.business.abstracts.JobSeekerService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.backend.hrms.core.utilities.results.SuccessResult;
import com.hrms.backend.hrms.dataAccess.abstracts.JobSeekerDao;
import com.hrms.backend.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao candidateDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.candidateDao.findAll(),"İş Arayanlar Listelendi");
	}

	@Override
	public Result add(JobSeeker candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("İş Arayan Kişi Eklendi");
	}
	

}
