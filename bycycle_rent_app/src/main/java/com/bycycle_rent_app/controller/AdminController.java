package com.bycycle_rent_app.controller;

import org.springframework.http.ResponseEntity;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;

public interface AdminController {
	public ResponseEntity<Integer> addBicycle(BicycleDTO bicycleDTO);

	public ResponseEntity<String> changeRentById(Integer bicycleId, Double rent);

	public ResponseEntity<String> changeStatusById(Integer bicycleId, Boolean status);

	public ResponseEntity<Integer> addUser(UserDTO userDTO);
}
