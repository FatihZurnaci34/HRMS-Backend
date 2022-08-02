package com.hrms.backend.hrms.business.abstracts;

import java.util.List;

import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.Language;

public interface LanguageService {
	
	Result add(Language language);
	
	DataResult<List<Language>> getAll();

}
