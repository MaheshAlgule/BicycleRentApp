package com.bycycle_rent_app.controller;

import org.springframework.http.ResponseEntity;

import com.bycycle_rent_app.dto.BicycleList;
import com.bycycle_rent_app.exception.BicycleRentException;

public interface UserController {

	public ResponseEntity<String> rentBicycle(Integer bicycleId) throws BicycleRentException;

	public ResponseEntity<BicycleList> searchBicycleByType(String type) throws BicycleRentException;

	public ResponseEntity<BicycleList> searchBicycleBelowGivenRent(Double rent) throws BicycleRentException;

}
