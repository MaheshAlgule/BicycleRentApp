package com.bycycle_rent_app.repository;
import org.springframework.data.repository.CrudRepository;

import com.bycycle_rent_app.entity.User;
public interface UserRepository extends CrudRepository<User,Integer> {

}
