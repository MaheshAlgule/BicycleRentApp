package com.bycycle_rent_app.dto;

import com.bycycle_rent_app.entity.Bicycle;
import com.bycycle_rent_app.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class BicycleDTO {
	private String type;
	private Integer cycleId;
	private Double rentFee;
	private Boolean status;

	public static BicycleDTO bicycleToBicycleDTO(Bicycle bicycle) {
		BicycleDTO bicycleDTO = new BicycleDTO();
		bicycleDTO.setCycleId(bicycle.getCycleId());
		bicycleDTO.setRentFee(bicycle.getRentFee());
		bicycleDTO.setStatus(bicycle.getStatus());
		bicycleDTO.setType(bicycle.getType());
		return bicycleDTO;
	}

	public static Bicycle bicycleDTOToBicycle(BicycleDTO bicycleDTO) {
		Bicycle bicycle = new Bicycle();
		bicycle.setCycleId(bicycleDTO.getCycleId());
		bicycle.setRentFee(bicycleDTO.getRentFee());
		bicycle.setStatus(bicycleDTO.getStatus());
		bicycle.setType(bicycleDTO.getType());
		return bicycle;
	}

}
