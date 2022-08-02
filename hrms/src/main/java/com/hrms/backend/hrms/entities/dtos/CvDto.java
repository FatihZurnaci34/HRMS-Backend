package com.hrms.backend.hrms.entities.dtos;

import java.util.List;

import com.hrms.backend.hrms.entities.concretes.JobSeeker;
import com.hrms.backend.hrms.entities.concretes.JobSeekerExperience;
import com.hrms.backend.hrms.entities.concretes.JobSeekerLanguage;
import com.hrms.backend.hrms.entities.concretes.JobSeekerPosition;
import com.hrms.backend.hrms.entities.concretes.JobSeekerSkill;
import com.hrms.backend.hrms.entities.concretes.JobSeekerSchool;
import com.hrms.backend.hrms.entities.concretes.Photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CvDto {
	
	private JobSeeker jobSeeker;
	
	private Photo photo;
	
	private List<JobSeekerSkill> jobSeekerSkills;
	
	private List<JobSeekerLanguage> jobSeekerLanguages;
	
	private List<JobSeekerSchool> joobSeekerSchools;
	
	private List<JobSeekerExperience> jobSeekerExperiences;
	
	private List<JobSeekerPosition> jobSeekerPositions;

}
