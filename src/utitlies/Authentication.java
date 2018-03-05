package utitlies;

import bean.User;

public interface Authentication {

	boolean authenticate(User user);
	String authorize(String roll);
	boolean changeLoginStatus(User user, int loginStatus);
}
