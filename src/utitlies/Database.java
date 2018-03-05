package utitlies;


import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	private static Connection con = null;
	private static String url = "jdbc:mysql://localhost:3306/portal";
	private static String user = "root";
	private static String pass = "root";
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pass);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		return con;
	}
}