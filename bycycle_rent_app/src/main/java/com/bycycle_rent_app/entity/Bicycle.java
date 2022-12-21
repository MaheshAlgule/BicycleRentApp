package com.bycycle_rent_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bicycle {
	
	
	private String type;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cycleId;
	private Double rentFee;
	private Boolean status;
	
}
