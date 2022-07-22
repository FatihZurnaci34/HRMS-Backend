package com.hrms.backend.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.backend.hrms.business.abstracts.PersonService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.backend.hrms.core.utilities.results.SuccessResult;
import com.hrms.backend.hrms.dataAccess.abstracts.PersonDao;
import com.hrms.backend.hrms.entities.concretes.Person;

@Service
public class PersonManager implements PersonService{
	
	private PersonDao personDao;
	
	@Autowired
	public PersonManager(PersonDao personDao) {
		super();
		this.personDao = personDao;
	}

	@Override
	public DataResult<List<Person>> getAll() {
		return new SuccessDataResult<List<Person>>(this.personDao.findAll(),"Çalışanlar Listelendi");
	}

	@Override
	public Result getAll(Person person) {
		this.personDao.save(person);
		return new SuccessResult("Çalışan Eklendi");
	}

}
