package com.hrms.backend.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.backend.hrms.entities.concretes.JobSeekerLanguage;

public interface JobSeekerLanguageDao extends JpaRepository<JobSeekerLanguage, Integer>{
	
	List<JobSeekerLanguage> getByUserId(int id);

}
