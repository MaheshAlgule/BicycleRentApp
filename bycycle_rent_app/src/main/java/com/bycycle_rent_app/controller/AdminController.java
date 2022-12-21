package com.bycycle_rent_app.controller;

import org.springframework.http.ResponseEntity;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;
import com.bycycle_rent_app.exception.BicycleRentException;

public interface AdminController {
	public ResponseEntity<Integer> addBicycle(BicycleDTO bicycleDTO);

	public ResponseEntity<String> changeRentById(Integer bicycleId, Double rent)throws BicycleRentException;

	public ResponseEntity<String> changeStatusById(Integer bicycleId, Boolean status)throws BicycleRentException;

	public ResponseEntity<Integer> addUser(UserDTO userDTO);
}
