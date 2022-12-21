package com.bycycle_rent_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.bycycle_rent_app.dto.BicycleDTO;
import com.bycycle_rent_app.dto.UserDTO;
import com.bycycle_rent_app.entity.Bicycle;
import com.bycycle_rent_app.entity.User;
import com.bycycle_rent_app.exception.BicycleRentException;
import com.bycycle_rent_app.repository.BicycleRepository;
import com.bycycle_rent_app.repository.UserRepository;



@Service
@Transactional
@PropertySource("classpath:messages.properties")
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final BicycleRepository bicycleRepository;

	public UserServiceImpl(UserRepository userRepository, BicycleRepository bicycleRepository) {
		super();
		this.userRepository = userRepository;
		this.bicycleRepository = bicycleRepository;
	}

	public String rentBicycle(Integer bicycleId) throws BicycleRentException {
		 Optional<Bicycle> optionalBicycle = bicycleRepository.findById(bicycleId);
		  Bicycle bicycle = optionalBicycle.orElseThrow(()-> new BicycleRentException("Service.BICYCLE_NOT_FOUND") );
		if(bicycle.getStatus().equals(Boolean.TRUE)) {
			throw new BicycleRentException("Service.BICYCLE_ALREADY_BOOKED");
		}
		  
		  bicycle.setStatus(true);
		 return "Rented";
	}

	

	@Override
	public List<BicycleDTO> searchBicycleBelowGivenRent(Double rent) throws BicycleRentException {
		List<Bicycle> bicycleList = bicycleRepository.findBicycleBelowGivenRent(rent);
		System.out.println(bicycleList +" bicycle list");
		if(bicycleList.isEmpty()){
			 throw new BicycleRentException("Service.BICYCLE_NOT_FOUND");
		 }
		List<BicycleDTO> bicycleDTOs = new ArrayList<>();
		for (Bicycle bicycle : bicycleList) {
			BicycleDTO bicycleDTO = BicycleDTO.bicycleToBicycleDTO(bicycle);
			bicycleDTOs.add(bicycleDTO);
		}
		return bicycleDTOs;
	}

	@Override
	public List<BicycleDTO> searchBicycleByType(String type) throws BicycleRentException {
		List<Bicycle> bicycleList = bicycleRepository.findBicycleByType(type);
		if(bicycleList.isEmpty()){
			 throw new BicycleRentException("Service.BICYCLE_NOT_FOUND");
		 }
		List<BicycleDTO> bicycleDTOs = new ArrayList<>();
		for (Bicycle bicycle : bicycleList) {
			BicycleDTO bicycleDTO = BicycleDTO.bicycleToBicycleDTO(bicycle);
			bicycleDTOs.add(bicycleDTO);
		}
		return bicycleDTOs;
	}
	
	public Integer addUser(UserDTO userDTO) {
		User user = UserDTO.UserDTOToUser(userDTO);
		User savedUser = userRepository.save(user);
		return savedUser.getUserId();
	}

}
