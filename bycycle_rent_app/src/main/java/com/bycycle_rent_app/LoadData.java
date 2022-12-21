package com.bycycle_rent_app;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bycycle_rent_app.entity.Bicycle;
import com.bycycle_rent_app.entity.User;
import com.bycycle_rent_app.repository.BicycleRepository;
import com.bycycle_rent_app.repository.UserRepository;

@Component
public class LoadData implements CommandLineRunner {

	final private UserRepository userRepository;
	final private BicycleRepository bicycleRepository;

	public LoadData(UserRepository userRepository, BicycleRepository bicycleRepository) {
		super();
		this.userRepository = userRepository;
		this.bicycleRepository = bicycleRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Bicycle bicycle1 = new Bicycle("Road", 1, 12.50, false);
		Bicycle bicycle2 = new Bicycle("Mountain", 2, 28.50, false);
		Bicycle bicycle3 = new Bicycle("Hybrid", 3, 45.50, false);
		Bicycle bicycle4 = new Bicycle("Hybrid", 4, 32.50, false);
		Bicycle bicycle5 = new Bicycle("Road", 5, 10.50, false);
		Bicycle bicycle6 = new Bicycle("Electric", 6, 30.50, false);

		User user1 = new User(1, "Ramesh", "Dev", "ramDev@tmail.com", 9688897794L);
		User user2 = new User(2, "Rock", "Patel", "Rock@tmail.com", 9688897794L);
		User user3 = new User(3, "Rami", "Dock", "RamiDock@tmail.com", 9688897794L);
		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		
		bicycleRepository.saveAll(Arrays.asList(bicycle1, bicycle2, bicycle3, bicycle4, bicycle5, bicycle6));

		// add users
	
	}

}
