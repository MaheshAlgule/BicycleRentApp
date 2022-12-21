package com.bycycle_rent_app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bycycle_rent_app.entity.Bicycle;

public interface BicycleRepository extends CrudRepository<Bicycle, Integer> {
	@Query("select b from Bicycle b where b.type= :type")
	public List<Bicycle> findBicycleByType(@Param(value = "type") String type);

	@Query("select b from Bicycle b where b.rentFee <= :rent")
	public List<Bicycle> findBicycleBelowGivenRent(@Param(value = "rent") Double rent);
}
