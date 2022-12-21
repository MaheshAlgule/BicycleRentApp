package com.bycycle_rent_app.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;
import com.bycycle_rent_app.exception.BicycleRentException;
import com.bycycle_rent_app.service.BicycleService;
import com.bycycle_rent_app.service.UserService;



@RestController
@Validated
@RequestMapping("/admin")
public class AdminControllerImpl implements AdminController {

	private final UserService userService;

	private final BicycleService bicycleService;

	public AdminControllerImpl(UserService userService, BicycleService bicycleService) {
		super();
		this.userService = userService;
		this.bicycleService = bicycleService;
	}

	@PostMapping("/add_cycle")
	public ResponseEntity<Integer> addBicycle(@Valid @RequestBody BicycleDTO bicycleDTO) {
		Integer bicycleId = bicycleService.addBicycle(bicycleDTO);
		return new ResponseEntity<>(bicycleId, HttpStatus.CREATED);

	}

	@PutMapping("/change_rent")
	public ResponseEntity<String> changeRentById(Integer bicycleId, Double rent) throws BicycleRentException {
		String message = bicycleService.changeRentById(bicycleId, rent);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@PutMapping("/change_status")
	public ResponseEntity<String> changeStatusById(Integer bicycleId, Boolean status) throws BicycleRentException {
		String message = bicycleService.changeStatusById(bicycleId, status);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@PostMapping("/add_user")
	public ResponseEntity<Integer> addUser(@Valid UserDTO userDTO) {
		Integer userId = userService.addUser(userDTO);
		return new ResponseEntity<>(userId, HttpStatus.CREATED);
	}

}
