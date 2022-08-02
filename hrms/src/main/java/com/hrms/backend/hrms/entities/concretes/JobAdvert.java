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
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "job_adverts")
public class JobAdvert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "description", length = 3000)
	@Type(type = "text")
	@NotNull(message = "Description can not be null")
	@NotBlank
	private String description;

	@Column(name = "salary_min")
	@Min(3000)
	private int salaryMin;

	@Column(name = "salary_max")
	private int salaryMax;

	@Column(name = "open_position_count")
	@Min(value = 1)
	@NotNull(message = "PositionCount can not be null")
	private int openPositionCount;

	@Column(name = "application_deadline")
	@NotNull
	@NotNull(message = "Deadline can not be null")
	private Date applicationDeadline;

	@NotBlank
	@Null
	@Column(name = "release_date")
	private LocalDateTime releaseDate = LocalDateTime.now();

	@Column(name = "is_active")
	private boolean isActive = true;

	@NotBlank
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;

	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

}
