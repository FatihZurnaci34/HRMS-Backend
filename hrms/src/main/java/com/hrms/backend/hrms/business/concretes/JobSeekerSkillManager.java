package com.hrms.backend.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.backend.hrms.business.abstracts.JobSeekerSkillService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.backend.hrms.core.utilities.results.SuccessResult;
import com.hrms.backend.hrms.dataAccess.abstracts.JobSeekerSkillDao;
import com.hrms.backend.hrms.entities.concretes.JobSeekerSkill;

@Service
public class JobSeekerSkillManager implements JobSeekerSkillService{
	
	JobSeekerSkillDao jobSeekerSkillDao;

	@Autowired
	public JobSeekerSkillManager(JobSeekerSkillDao jobSeekerSkillDao) {
		super();
		this.jobSeekerSkillDao = jobSeekerSkillDao;
	}

	@Override
	public Result add(JobSeekerSkill jobSeekerSkill) {
		this.jobSeekerSkillDao.save(jobSeekerSkill);
		return new SuccessResult("İş arayan becerisi eklendis");
	}

	@Override
	public Result delete(JobSeekerSkill jobSeekerSkill) {
		this.jobSeekerSkillDao.delete(jobSeekerSkill);
		return new SuccessResult("İş arayan becerisi silindi");
	}

	@Override
	public DataResult<List<JobSeekerSkill>> getAll() {
		return new SuccessDataResult<List<JobSeekerSkill>>(this.jobSeekerSkillDao.findAll(),"İş arayanların becerisi listelendi");
	}

	@Override
	public DataResult<List<JobSeekerSkill>> getByUserId(int id) {
		return new SuccessDataResult<List<JobSeekerSkill>>(this.jobSeekerSkillDao.findByUserId(id));
	}

}
