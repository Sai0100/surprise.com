package org.hack.surprise.com.main.service;

import java.util.List;
import java.util.stream.Collectors;
import org.hack.surprise.com.main.config.SurpriseRepo;
import org.hack.surprise.com.main.model.Journey;
import org.hack.surprise.com.main.model.Request;
import org.hack.surprise.com.main.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SurpriseManagerImpl  {

	@Autowired
	private SurpriseRepo surpriseRepo;

	public List<User> getHelperList() {
		return null;
	}

	public List<User> getSenderList() {
		return null;
	}

	public boolean addGift() {
		return false;
	}

	public List<Request> getGiftRequests() {
		return surpriseRepo.getGiftRequests();
	}
	
	public List<Journey> getTravellers(String from,String to) {
		return surpriseRepo.getTravellers(from, to); 
	}

	public List<Journey> getJourneyFrom(String from) {
		List<Journey> journey = surpriseRepo.findAll();
		return journey;
	}
	
	public List<Journey> getJourneyTo(String to) {
		List<Journey> stream = surpriseRepo.findAll();
		return stream;
	}

	public boolean addJourneyDetails(Journey journey) {
		return surpriseRepo.save(journey);
	}

	public static void main(String[] args) {
		SurpriseManagerImpl impl = new SurpriseManagerImpl();
		System.out.println(impl.getJourneyFrom("Hyd"));
	}

}
