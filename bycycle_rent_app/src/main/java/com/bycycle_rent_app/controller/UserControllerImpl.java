package com.bycycle_rent_app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.BicycleList;
import com.bycycle_rent_app.exception.BicycleRentException;

import com.bycycle_rent_app.service.UserService;

@RestController
@RequestMapping("/user")
@Validated
public class UserControllerImpl implements UserController {

	private final UserService userService;

	public UserControllerImpl(UserService userService) {
		super();
		this.userService = userService;
	}

	@PutMapping("/rent/bicycle")
	public ResponseEntity<String> rentBicycle(@RequestParam("cycleId") Integer bicycleId) throws BicycleRentException {
		String message = userService.rentBicycle(bicycleId);
		return new ResponseEntity<>(message, HttpStatus.CREATED);
	}

	@GetMapping("/get_list_by_type/{type}")
	public ResponseEntity<BicycleList> searchBicycleByType(@PathVariable String type) throws BicycleRentException {
		BicycleList bicycleList = new BicycleList();
		List<BicycleDTO> bicycleDTOs = userService.searchBicycleByType(type);
		bicycleList.setBicycleList(bicycleDTOs);
		return new ResponseEntity<>(bicycleList, HttpStatus.OK);
	}

	@GetMapping("/get_list_by_rent/{rent}")
	public ResponseEntity<BicycleList> searchBicycleBelowGivenRent(@PathVariable Double rent) throws BicycleRentException {
		BicycleList bicycleList = new BicycleList();
		System.out.println(rent+"  rent");
		List<BicycleDTO> bicycleDTOs = userService.searchBicycleBelowGivenRent(rent);
		System.out.println(bicycleDTOs+"  dtos");
		bicycleList.setBicycleList(bicycleDTOs);
		return new ResponseEntity<>(bicycleList, HttpStatus.OK);

	};
}
