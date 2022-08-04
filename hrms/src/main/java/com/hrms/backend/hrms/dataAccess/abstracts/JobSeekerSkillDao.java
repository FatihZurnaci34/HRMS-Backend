package com.hrms.backend.hrms.dataAccess.abstracts;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.backend.hrms.entities.concretes.JobSeekerSkill;

import com.hrms.backend.hrms.entities.dtos.JobSeekerSkillDetailsDto;
import org.springframework.data.jpa.repository.Query;

public interface JobSeekerSkillDao extends JpaRepository<JobSeekerSkill, Integer>{
	
    List<JobSeekerSkill> findByUserId(int id);

}
