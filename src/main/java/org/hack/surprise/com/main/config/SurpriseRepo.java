package org.hack.surprise.com.main.config;

import org.hack.surprise.com.main.model.Journey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface SurpriseRepo extends JpaRepository<Journey, Integer> {
	
}
