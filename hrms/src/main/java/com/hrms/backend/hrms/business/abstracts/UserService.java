package com.hrms.backend.hrms.business.abstracts;

import java.util.List;

import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.User;

public interface UserService {
	
	DataResult<User> getByUserId(int id);
	DataResult<List<User>> getAll();
	
	Result delete(User user);

}
