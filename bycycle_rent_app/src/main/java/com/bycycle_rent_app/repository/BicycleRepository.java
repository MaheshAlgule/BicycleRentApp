package com.bycycle_rent_app.repository;

import org.springframework.data.repository.CrudRepository;

import com.bycycle_rent_app.entity.Bicycle;

public interface BicycleRepository extends CrudRepository<Bicycle, Integer> {

}
