package com.hrms.backend.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employers","cities","job","job_advertisments","jobAdvertisments"})
@Table(name="employers")
public class Employer extends User{

	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site")
	private String webSite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@JsonIgnore
    @OneToMany(mappedBy = "employer", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<JobAdvert> jobAdverts;
	

}
