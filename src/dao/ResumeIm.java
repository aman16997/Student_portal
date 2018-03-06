package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.resume;
import utitlies.Database;

public class ResumeIm implements ResumeDao {

	//Connection of Database
	static Connection con = Database.getConnection();
	
	@Override
	public String createResume(resume rs) {
		
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO RESUME VALUES(?,?,?,?,?,?,?,?,?,?,?,?) WHERE ROLL = ?");
			ps.setString(2, rs.getFirst_name());
			ps.setString(3, rs.getLast_name());
			ps.setInt(4, rs.getContact());
			ps.setString(5, rs.getEmail());
			ps.setString(6, rs.getBranch());
			ps.setString(7, rs.getEducation());
			ps.setString(8, rs.getAchivement());
			ps.setString(9, rs.getGit());
			ps.setString(10, rs.getIntership());
			ps.setString(11, rs.getHobbies());
			ps.setString(12, rs.getSkill());
			ps.setString(13, rs.getOther());
			ps.setInt(1, rs.getRoll());
			int a = ps.executeUpdate();
			if(a != 0)
			{
				return "Resume Updated";
			}
			else
			{
				return "Failed To Update";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Internal Error";
	}

	@Override
	public int deleteUser(ArrayList<String> li) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateUser(resume rs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public resume findByRoll(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<resume> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
