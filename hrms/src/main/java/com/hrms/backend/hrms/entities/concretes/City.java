package com.hrms.backend.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
@Table(name="cities")
public class City {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	@NotBlank
	@NotNull(message="CityName cannot be null")
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "city" )
	private List<JobAdvert> jobAdverts;

}
