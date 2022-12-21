package com.bycycle_rent_app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.bycycle_rent_app.dto.BicycleDTO;

import com.bycycle_rent_app.entity.Bicycle;

import com.bycycle_rent_app.exception.BicycleRentException;
import com.bycycle_rent_app.repository.BicycleRepository;


@Service
@Transactional
@PropertySource("classpath:messages.properties")
public class BicycleServiceImpl implements BicycleService {

	private final BicycleRepository bicycleRepository;

	public BicycleServiceImpl(BicycleRepository bicycleRepository) {
		super();

		this.bicycleRepository = bicycleRepository;
	}

	public Integer addBicycle(BicycleDTO bicycleDTO) {
		Bicycle bicycle = BicycleDTO.bicycleDTOToBicycle(bicycleDTO);
		Bicycle bicycleSaved = bicycleRepository.save(bicycle);
		return bicycleSaved.getCycleId();
	}

	public String changeRentById(Integer bicycleId, Double rent) throws BicycleRentException {
		Optional<Bicycle> optBicycle = bicycleRepository.findById(bicycleId);
		Bicycle bicycle = optBicycle.orElseThrow(() -> new BicycleRentException("Service.BICYCLE_NOT_FOUND"));
		bicycle.setRentFee(rent);

		return "Rent Updated";
	}

	public String changeStatusById(Integer bicycleId, Boolean status) throws BicycleRentException {
		Optional<Bicycle> optBicycle = bicycleRepository.findById(bicycleId);
		Bicycle bicycle = optBicycle.orElseThrow(() -> new BicycleRentException("Service.BICYCLE_NOT_FOUND"));

		bicycle.setStatus(status);

		return "status updated";
	}

}
