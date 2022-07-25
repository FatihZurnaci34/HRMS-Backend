package com.hrms.backend.hrms.business.abstracts;

import java.util.List;

import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.JobAdvertisement;

public interface JobAdversitementService {
	
	DataResult<List<JobAdvertisement>> getAll();
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getActiveAdvertisements();
	
	Result adversitementActiveTrue(int jobAdversitementId);
	
	Result adversitementActiveFalse(int jonAdversitementId);
	
	DataResult<List<JobAdvertisement>> getActiveAdvertisementsByEmployer();
	
	DataResult<List<JobAdvertisement>> getActiveAdvertisementsByDeadlineAsc();
	
    DataResult<List<JobAdvertisement>> getActiveAdvertisementsByDeadlineDesc();

	DataResult<List<JobAdvertisement>> getActiveAdvertisementsByEmployer(int employerId);
    

}
