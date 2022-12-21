package com.bycycle_rent_app.dto;

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



}
