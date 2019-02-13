package org.hack.surprise.com.main.controller;

import java.util.List;

import org.hack.surprise.com.main.model.Journey;
import org.hack.surprise.com.main.model.Request;
import org.hack.surprise.com.main.model.User;
import org.hack.surprise.com.main.service.SurpriseManager;
import org.hack.surprise.com.main.service.SurpriseManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("surprise/")
public class SurpriseController implements SurpriseManager {

	@Autowired
	private SurpriseManagerImpl surpriseManagerImpl;

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
	@RequestMapping(value = "getFrom/{from}", method = RequestMethod.GET)
	public List<Journey> getJourneyFrom(@PathVariable("from") String from) {
		return surpriseManagerImpl.getJourneyFrom(from);
	}

	@Override
	@RequestMapping(value = "getTo/{to}", method = RequestMethod.GET)
	public List<Journey> getJourneyTo(@PathVariable("to") String to) {
		return surpriseManagerImpl.getJourneyTo(to);
	}

	@Override
	@RequestMapping(value = "save/journey", method = RequestMethod.POST)
	public boolean addJourneyDetails(@RequestBody Journey journey) {
		return surpriseManagerImpl.addJourneyDetails(journey);
	}

}
