package com.hrms.backend.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hrms.backend.hrms.business.abstracts.JobAdversitementService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.backend.hrms.core.utilities.results.SuccessResult;
import com.hrms.backend.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.hrms.backend.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdversitementManager implements JobAdversitementService{
	
	private JobAdvertisementDao jobAdversitementDao;

	public JobAdversitementManager(JobAdvertisementDao jobAdversitementDao) {
		super();
		this.jobAdversitementDao = jobAdversitementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversitementDao.findAll());
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdversitementDao.save(jobAdvertisement);
		return new SuccessResult("İş İlanı Başarıyla Eklendi");
	}

}
