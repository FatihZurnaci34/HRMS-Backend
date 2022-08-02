package com.hrms.backend.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.backend.hrms.business.abstracts.PhotoService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.backend.hrms.core.utilities.results.SuccessResult;
import com.hrms.backend.hrms.dataAccess.abstracts.PhotoDao;
import com.hrms.backend.hrms.entities.concretes.Photo;


@Service
public class PhotoManager implements PhotoService{

	PhotoDao photoDao;
	
	@Autowired
	public PhotoManager(PhotoDao photoDao) {
		super();
		this.photoDao = photoDao;
	}

	@Override
	public Result add(Photo photo) {
		this.photoDao.save(photo);
		return new SuccessResult("Fotoğraf eklendi");
	}
	
	@Override
	public DataResult<Photo> getByUserId(int id) {
		return new SuccessDataResult<Photo>(this.photoDao.findByUserId(id));
	}

}
