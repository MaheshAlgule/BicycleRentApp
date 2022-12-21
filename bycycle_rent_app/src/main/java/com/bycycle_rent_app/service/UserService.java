package com.bycycle_rent_app.service;

import java.util.List;

import com.bycycle_rent_app.dto.BicycleDTO;

public interface UserService {

	public String rentBicycle(Integer userId,Integer bicycleId);
	public List<BicycleDTO> searchBicycleByType();
	public List<BicycleDTO> searchBicycleByRent();
}
