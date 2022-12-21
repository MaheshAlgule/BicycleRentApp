package com.bycycle_rent_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping("/admin")
public class AdminControllerImpl implements AdminController {
	
	@PostMapping("/add_cycle")
	public ResponseEntity<Integer> addBicycle(@Valid @RequestBody BicycleDTO bicycleDTO) {
		return null;

	}

	@PutMapping("/change_rent")
	public ResponseEntity<String> changeRentById(Integer bicycleId, Double rent) {
		
		return null;
	}
	@PutMapping("/change_status")
	public ResponseEntity<String> changeStatusById(Integer bicycleId, Boolean status) {
		
		return null;
	}
	
	@PostMapping("/add_user")
	public ResponseEntity<Integer> addUser(@Valid UserDTO userDTO) {
		
		return null;
	}
	
	
}
