package com.hrms.backend.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.backend.hrms.business.abstracts.UserService;
import com.hrms.backend.hrms.core.utilities.results.DataResult;
import com.hrms.backend.hrms.core.utilities.results.Result;
import com.hrms.backend.hrms.entities.concretes.User;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		
		return this.userService.getAll();
		
	}
	
	@GetMapping("/getById")
	
	public ResponseEntity<?> getById(@RequestParam int id){
		
		return ResponseEntity.ok(this.userService.getByUserId(id));
		
	}
	
	@DeleteMapping("/delete")
	public Result add(@RequestBody User user) {
		return this.userService.delete(user);
	}

}
