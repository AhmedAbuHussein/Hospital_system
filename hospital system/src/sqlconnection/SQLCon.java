package sqlconnection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

public class SQLCon {
	
	public   static Connection			con = null;
	public   static PreparedStatement  	stat = null;
	
	public static String 		user = "root";
	public static String 		password = "";
	public static String 		url = "jdbc:mysql://localhost/hospital_system";
	
	public static ResultSet SQLConnection(String sql){
		try {
			Class.forName("com.mysql.jdbc.Driver");           // load for driver to know i deal with oracle server
			con =  DriverManager.getConnection(url, user ,password);
			stat =con.prepareStatement(sql);
			ResultSet rs = stat.executeQuery();
			return rs;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
			
		
		
	}
	
	public static void SQLConn(String sql){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection(url, user ,password);
			stat =con.prepareStatement(sql);
			stat.executeUpdate();
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
