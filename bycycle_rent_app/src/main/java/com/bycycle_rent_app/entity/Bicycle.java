package com.bycycle_rent_app.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bicycle {
	
	
	private String type;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cycleId;
	private Double rentFee;
	private Boolean status;
	
}
