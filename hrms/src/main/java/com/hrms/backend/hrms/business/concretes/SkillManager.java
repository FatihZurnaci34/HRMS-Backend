package com.hrms.backend.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.backend.hrms.business.abstracts.SkillService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.backend.hrms.core.utilities.results.SuccessResult;
import com.hrms.backend.hrms.dataAccess.abstracts.SkillDao;
import com.hrms.backend.hrms.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService{
	
	SkillDao skillDao;

	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("Beceri Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll(),"Beceriler Listelendi");
	}


}
