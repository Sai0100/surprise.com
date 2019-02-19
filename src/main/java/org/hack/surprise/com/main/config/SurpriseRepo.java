package org.hack.surprise.com.main.config;

import java.util.ArrayList;
import java.util.List;

import org.hack.surprise.com.main.model.Journey;
import org.springframework.stereotype.Component;

@Component
public class SurpriseRepo {

	private static ArrayList<Journey> list = new ArrayList<>();
	
	static {
		Journey journey = new Journey();
		list.add(journey);
	}

	public List<Journey> findAll() {
		return list;
	}

	public boolean save(Journey journey) {
		return list.add(journey);
	}
	
	
	
}

