package org.hack.surprise.com.main.service;

import java.util.List;

import org.hack.surprise.com.main.model.Request;
import org.hack.surprise.com.main.model.User;

public interface ServiceManager {

	List<User> getHelperList();

	List<User> getSenderList();

	boolean addGift();

	List<Request> getGiftRequests();

}
