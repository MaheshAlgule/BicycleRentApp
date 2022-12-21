package com.bycycle_rent_app.service;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;
import com.bycycle_rent_app.exception.BicycleRentException;

public interface BicycleService {

	
	public Integer addBicycle(BicycleDTO bicycleDTO) ;
	public String changeRentById(Integer bicycleId, Double rent) throws BicycleRentException;
	public String changeStatusById(Integer bicycleId,Boolean status) throws BicycleRentException;
	
}
