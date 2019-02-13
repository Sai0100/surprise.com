package org.hack.surprise.com.main.service;

import java.util.List;

import org.hack.surprise.com.main.model.Journey;
import org.hack.surprise.com.main.model.Request;
import org.hack.surprise.com.main.model.User;

public interface SurpriseManager {

	List<User> getHelperList();

	List<User> getSenderList();

	boolean addGift();

	List<Request> getGiftRequests();

	List<Journey> getJourneyFrom(String from);

	List<Journey> getJourneyTo(String to);

	boolean addJourneyDetails(Journey journey);

}
