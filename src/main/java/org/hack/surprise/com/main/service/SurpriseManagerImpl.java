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
public class SurpriseManagerImpl implements SurpriseManager {

	@Autowired
	private SurpriseRepo surpriseRepo;

	@Override
	public List<User> getHelperList() {
		return null;
	}

	@Override
	public List<User> getSenderList() {
		return null;
	}

	@Override
	public boolean addGift() {
		return false;
	}

	@Override
	public List<Request> getGiftRequests() {
		return null;
	}

	@Override
	public List<Journey> getJourneyFrom(String from) {
		List<Journey> journey = surpriseRepo.findAll();
		return journey;
	}
	
	@Override
	public List<Journey> getJourneyTo(String to) {
		List<Journey> stream = surpriseRepo.findAll();
		return stream;
	}

	@Override
	public boolean addJourneyDetails(Journey journey) {
		journey = surpriseRepo.save(journey);
		return journey == null ? false : true;
	}

	public static void main(String[] args) {
		SurpriseManagerImpl impl = new SurpriseManagerImpl();
		System.out.println(impl.getJourneyFrom("Hyd"));
	}

}
