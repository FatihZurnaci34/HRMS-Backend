package com.hrms.backend.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@Table(name="job_seekers")
public class JobSeeker extends User{
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_number")
	private String NationalityNumber;
	
	@Column(name="birth_year")
	private String birthYear;
	
    @Column(name = "linkedin_link")
    private String linkedinLink;

    @Column(name = "github_link")
    private String githubLink;

    @Column(name = "cover_letter")
    private String coverLetter;

}
