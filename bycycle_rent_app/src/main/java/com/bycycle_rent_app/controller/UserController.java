package com.bycycle_rent_app.controller;

import org.springframework.http.ResponseEntity;

import com.bycycle_rent_app.dto.BicycleList;

public interface UserController {
	
	public ResponseEntity<String> rentBicycle(Integer userId,  Integer bicycleId) ;
	
	public ResponseEntity<BicycleList> searchBicycleByType( String type);


	public  ResponseEntity<BicycleList> searchBicycleByRent(Double rent);

}
