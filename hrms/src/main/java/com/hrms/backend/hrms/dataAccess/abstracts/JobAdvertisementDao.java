package com.hrms.backend.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.backend.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

	JobAdvertisement findById(int id);
	
	List<JobAdvertisement> findByIsActiveTrue();
	
	List<JobAdvertisement> findByEmployer_UserIdAndIsActiveTrue(int employerId);
	
	List<JobAdvertisement> findByIsActiveTrueOrderByApplicationDeadlineAsc();
	
    List<JobAdvertisement> findByIsActiveTrueOrderByApplicationDeadlineDesc();
	
	
}
