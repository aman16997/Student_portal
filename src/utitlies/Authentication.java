package utitlies;

import bean.User;
import bean.credentials;

public interface Authentication {

	boolean authenticate(credentials cre);
	String authorize(String roll);
	boolean changeLoginStatus(User user, int loginStatus);
}
