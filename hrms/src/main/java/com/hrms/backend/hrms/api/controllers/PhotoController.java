package com.hrms.backend.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hrms.backend.hrms.business.abstracts.PhotoService;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.Photo;

@RestController
@RequestMapping("api/photo")
public class PhotoController {
	
	PhotoService photoService;
	
	@Autowired
	public PhotoController(PhotoService photoService) {
		super();
		this.photoService = photoService;
	}

	@PostMapping("/add")
    public Result add(@RequestBody Photo photo) {
		
		return this.photoService.add(photo);
	}
    
	
	@GetMapping("/getByUserId")
    public ResponseEntity<?> getByUserId(int id){
        return ResponseEntity.ok(photoService.getByUserId(id));
    }

}
