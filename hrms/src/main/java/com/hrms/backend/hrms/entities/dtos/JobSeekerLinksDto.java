package com.hrms.backend.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobSeekerLinksDto {

	private int userId;
	private String gihubLink;
	private String linkedinLink;
}
