package dao;

import java.util.ArrayList;

import bean.resume;

public interface ResumeDao {

	String createResume(resume rs);
	int deleteUser(ArrayList<String> li);
	boolean updateUser(resume rs);
	resume findByRoll(int roll);
	ArrayList<resume> findAll();
}
