package com.hrms.backend.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_seeker_languages")

public class JobSeekerLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@JoinColumn(name="language_id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Language language;
	
	
	@Min(1)
    @Max(5)
    @Column(name = "level")
    private int level;
	
	@NotNull
    @Column(name = "user_id")
    private int userId;

}
