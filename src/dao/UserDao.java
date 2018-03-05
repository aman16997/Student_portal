package dao;

import java.util.ArrayList;

import bean.User;

public interface UserDao {

	String createUser(User ubean);
	int deleteUser(ArrayList<String> li);
	boolean updateUser(User ubean);
	User findByRoll(int roll);
	ArrayList<User> findAll();

}
