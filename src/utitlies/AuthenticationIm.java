package utitlies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;
import bean.credentials;

public class AuthenticationIm implements Authentication {

	Connection con = Database.getConnection();
	@Override
	public boolean authenticate(User user) {
		
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM LOGIN WHERE ROLL = ? AND PASS = ?");
			ps.setInt(1, user.getRollno());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
			{
				return false;
			}
			}
				catch(Exception e)
				{
					e.printStackTrace();
					return false;
				}	
		}
		

	@Override
	public String authorize(String roll) {
		//String roll1 = roll.get(0);
		int rolln = Integer.parseInt(roll);
		//System.out.println(rolln);
		try {
			PreparedStatement ps = con.prepareStatement("SELECT ROLE FROM LOGIN WHERE ROLL =?");
			//System.out.println(rolln);
			ps.setInt(1, rolln);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String role = rs.getString("role");
				return role;
			}
			else {
				return "User doesn't exist.";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "Internal Error";
	}

	@Override
	public boolean changeLoginStatus(User user, int loginStatus) {
		// TODO Auto-generated method stub
		return false;
	}




}
