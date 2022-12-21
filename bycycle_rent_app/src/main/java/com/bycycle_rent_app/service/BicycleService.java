package com.bycycle_rent_app.service;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;

public interface BicycleService {

	
	public Integer addBicycle(BicycleDTO bicycleDTO);
	public String changeRentById(Integer bicycleId, Double rent);
	public String changeStatusById(Integer bicycleId,Double rent);
	public String addUser(UserDTO userDTO);
}
