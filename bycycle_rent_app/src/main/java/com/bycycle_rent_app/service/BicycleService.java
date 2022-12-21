package com.bycycle_rent_app.service;

import com.bycycle_rent_app.dto.BicycleDTO;

public interface BicycleService {

	
	public Integer addBicycle(BicycleDTO bicycleDTO);
	public String changeRentById(Integer bicycleId);
	public String changeStatusById(Integer bicycleId);
}
