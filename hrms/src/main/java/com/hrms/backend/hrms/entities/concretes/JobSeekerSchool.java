package com.hrms.backend.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_seeker_school")

public class JobSeekerSchool {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="department_name")
	private String departmentName;
	
	@NotNull
	@Column(name="start_year")
	private int startYear;
	
	@Column(name="finish_year")
	private int finishYear;
	
	@Column(name="user_id")
	private int userId;
	
	
}
