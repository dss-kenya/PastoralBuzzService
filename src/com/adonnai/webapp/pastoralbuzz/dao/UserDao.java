package com.adonnai.webapp.pastoralbuzz.dao;

import java.util.List;

import com.adonnai.webapp.pastoralbuzz.models.UserModel;

public interface UserDao {
	/**
	 * for registration purposes
	 * @param user
	 */
	void addUser(UserModel user);
	
	/**
	 * For login purposes
	 * @param user
	 */
	void getUser(UserModel user);
	
	/**
	 * For profile updations
	 * @param user
	 */
	void updateUser(UserModel user);
	
	/**
	 * To get a list of users in the application
	 * @return
	 */
	List<UserModel> getUserList();
}
