package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.User;
import utitlies.Database;

public class UserIm implements UserDao {

	//Connection of Database
	static Connection con = Database.getConnection();
	
	@Override
	public String createUser(User u) {
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO USER VALUES(?,?,?,?,?,?)");
			ps.setString(1, u.getFirst_name());
			ps.setString(2, u.getLast_name());
			ps.setString(3, u.getEmail());
			ps.setInt(4, u.getRollno());
//			ps.setString(5, u.getPassword());
			ps.setString(5, u.getBranch());
			ps.setInt(6, u.getContact());
			int a = ps.executeUpdate();
			if(a != 0)
			{
				return ""+u.getRollno()+" your account is created.";
			}
			else
			{
				return "Your account can't be created.";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
	return "Error";
	}

	@Override
	public int deleteUser(ArrayList<String> li) {
		
		//String roll = li.get(0);
		
		try {
			PreparedStatement ps = con.prepareStatement("DELETE FROM USER WHERE ROLL = ?");
			ps.setArray(1, (Array) li);
			int a = ps.executeUpdate();
			return a;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean updateUser(User ubean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findByRoll(int roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
