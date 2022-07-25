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

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertisements() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversitementDao.findByIsActiveTrue());
	}
	
	@Override
	public Result adversitementActiveTrue(int jobAdversitementId) {
		JobAdvertisement jobAdvertisement = jobAdversitementDao.findById(jobAdversitementId);
		jobAdvertisement.setActive(true);
		jobAdversitementDao.save(jobAdvertisement);
		return new SuccessResult("İlan durumu aktif oldu");
	}

	@Override
	public Result adversitementActiveFalse(int jonAdversitementId) {
		JobAdvertisement jobAdvertisement = jobAdversitementDao.findById(jonAdversitementId);
		jobAdvertisement.setActive(false);
		jobAdversitementDao.save(jobAdvertisement);
		return new SuccessResult("İlan durumu pasif oldu");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsByDeadlineAsc() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversitementDao.findByIsActiveTrueOrderByApplicationDeadlineAsc());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsByDeadlineDesc() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversitementDao.findByIsActiveTrueOrderByApplicationDeadlineDesc());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsByEmployer(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdversitementDao.findByEmployer_UserIdAndIsActiveTrue(employerId));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getActiveAdvertisementsByEmployer() {
		// TODO Auto-generated method stub
		return null;
	}






}
