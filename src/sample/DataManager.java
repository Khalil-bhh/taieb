package sample;

import java.sql.*;
import java.util.ArrayList;

public class DataManager {
	static Connection connection;
	public DataManager() {
		 try {
	         Class.forName("com.mysql.jdbc.Driver").newInstance();
	     } catch (Exception e) {
	      System.err.println(e.toString());
	     }
		String url = "jdbc:mysql://localhost:3306/taieb";
		try {
		connection = DriverManager.getConnection(url, "root", "");
		} catch (SQLException e) {
		System.err.println(e.getMessage());
		}
	}

	public ArrayList<ItemInfoObject> getInventory() {
		ArrayList<ItemInfoObject> inventory = new ArrayList<ItemInfoObject>();
		try {
			Statement st = connection.createStatement();
			String sqlQuery = "select * from item";
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+
						rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+
						rs.getString(6) + " "+rs.getInt(7));
				ItemInfoObject item = new ItemInfoObject(rs.getInt(1),rs.getString(2),
						rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getInt(7));
				inventory.add(item);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getBooksByKeywords");
		}
		return inventory;
	}

}
