package com.hrms.backend.hrms.business.abstracts;

import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.Photo;

public interface PhotoService {
	
	Result add(Photo photo);
	
	DataResult<Photo> getByUserId(int id);

}
