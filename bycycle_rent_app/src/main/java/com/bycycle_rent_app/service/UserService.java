package com.bycycle_rent_app.service;

import java.util.List;

import com.bycycle_rent_app.BycycleRentApp;
import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;
import com.bycycle_rent_app.exception.BicycleRentException;

public interface UserService {

	public String rentBicycle(Integer bicycleId) throws BicycleRentException ;
	public List<BicycleDTO> searchBicycleByType(String type) throws BicycleRentException;
	public List<BicycleDTO> searchBicycleBelowGivenRent(Double rent) throws BicycleRentException;
	public Integer addUser(UserDTO userDTO);
}
