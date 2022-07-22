package com.hrms.backend.hrms.entities.concretes;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_advertisements")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank
	@NotNull
	@Column(name="description")
	private String description;
	
    @NotBlank
    @Column(name = "min_salary")
    private int minSalary;

    @NotBlank
    @Column(name = "max_salary")
    private int maxSalary;
    
    @NotBlank
    @NotNull
    @Column(name="application_deadline")
    private Date applicationDeadline;
    
    @NotBlank
    @Null
    @Column(name="release_date")
    private LocalDateTime releaseData = LocalDateTime.now();
    
    @NotBlank
    @NotNull
    @Column(name="open_position_count")
    private int openPositionCount;
    
    @NotBlank
    @Null
    @Column(name="is_active")
    private boolean isActive;
    
    @NotBlank
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employer_id")
    private Employer employer;
    
    @NotBlank
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="job_position_id")
    private JobPosition jobPosition;
    
    @NotBlank
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="city_id")
    private City city;

}
