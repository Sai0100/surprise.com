package org.hack.surprise.com.main.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hack.surprise.com.main.model.Journey;
import org.hack.surprise.com.main.model.Request;
import org.hack.surprise.com.main.model.User;

public class DataInit {

	public static ArrayList<Journey> journeys = new ArrayList<>();

	public static String from[] = { "Hyderbad", "Warangal", "Karimnagar", "Vizag", "Vijayawada", "Nizamabad", "Guntur",
			"kakinada", "Adilabad", "Nalgoada", "Pocharam" };
	public static String to[] = { "Warangal", "Karimnagar", "Vizag", "Vijayawada", "Nizamabad", "Guntur", "kakinada",
			"Adilabad", "Nalgoada", "Pocharam", "Hyderabad" };
	public static String users[] = { "M.Karan Johar", "J.Annapurna", "K.Aahsritha Reddy", "H.Dulipudi Kiran",
			"K.Sai Kiran", "G.Gadde Sukumar", "M.Mikechle Swernick", "W.Donald Mike", "M.Art Peak", "M.Joshaph", };
	public static String gifts[] = { "Greeting Card", "Medicines", "Teddy", "Cloths", "Blankets", "Sweets", "Pendrive",
			"Mobile" };
	public static ArrayList<Request> giftsList = new ArrayList<>();

	public List<Journey> getTravellers(String from, String to) {
		ArrayList<Journey> helpers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Journey j = new Journey(from, to);
			User user = new User(users[i]);
			user.setId(i + 1);
			j.setUser(user);
			j.setJourneyId(i + 1);
			j.setKms(Math.random() + 100);
			j.setEstTime(new Date().toString());
			j.setTravelType(i);
			j.setUserId(1);
			j.setSeatNum("S-" + 1 + i);
			helpers.add(j);
		}
		return helpers;
	}

	public List<Journey> getJourneyData() {
		journeys = new ArrayList<>();
		for (int i = 0; i < from.length; i++) {
			Journey j = new Journey(from[i], to[i]);
			j.setJourneyId(i + 1);
			j.setKms(Math.random() + 100);
			j.setEstTime("8:00 PM");
			j.setTravelType(i);
			j.setUserId(1);
			j.setSeatNum("S-" + 1 + i);
			journeys.add(j);
		}
		return journeys;
	}

	public List<Request> getGiftRequests() {
		for (int i = 0; i < gifts.length; i++) {
			Request request = new Request(gifts[i]);
			request.setDelDate(new Date());
			request.setReqId(i+1);
			request.setItemSize("3x4");
			request.setDelToComment("Please deliver the item at an old highway road");
			request.setDelToName(users[users.length-i-1]); 
			User user = new User(users[i]);
			user.setId(i + 1);
			request.setUser(user);
			giftsList.add(request);
		}
		return giftsList;
	}

	public boolean add(Journey journey) {
		return journeys.add(journey);
	}

}
