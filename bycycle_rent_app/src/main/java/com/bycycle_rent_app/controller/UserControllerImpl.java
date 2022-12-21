package com.bycycle_rent_app.controller;

import java.util.List;

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

@RestController
@RequestMapping("/user")
@Validated
public class UserControllerImpl implements UserController {

	@PutMapping("/rent/bicycle")
	public ResponseEntity<String> rentBicycle(@RequestParam Integer userId, @RequestParam("cycleId") Integer bicycleId) {
		return null;
	}
	
	@GetMapping("/getList/{type}")
	public ResponseEntity<BicycleList> searchBicycleByType(@PathVariable String type){
		return null;
	}
	@GetMapping("/getList/{rent}")
	public  ResponseEntity<BicycleList> searchBicycleByRent(Double rent){
		return null;
		
	};
}
