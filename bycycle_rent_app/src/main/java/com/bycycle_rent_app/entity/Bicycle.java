package com.bycycle_rent_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bicycle {
	
	
	private String type;
	@Id
	private Integer cycleId;
	private Double rentFee;
	private Boolean status;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getCycleId() {
		return cycleId;
	}
	public void setCycleId(Integer cycleId) {
		this.cycleId = cycleId;
	}
	public Double getRentFee() {
		return rentFee;
	}
	public void setRentFee(Double rentFee) {
		this.rentFee = rentFee;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Bicycle() {
		
	}
	
}
