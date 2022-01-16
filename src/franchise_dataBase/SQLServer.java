package franchise_dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLServer {

	private static String dbName = "franchise_market";
	private static String dbUser = "ibrahim";
	private static String dbPassword = "1234";
	private static String connectionUrl;

	private static Connection con;
	private static Statement stmt;
	private static PreparedStatement ps;
	
	
//	-----------------------------------------------------------------------------------------------------------------------------------
//	------------------------------------------------------------dbConnect--------------------------------------------------------------

	public static boolean dbConnect() {

		connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=" + dbName + ";user=" + dbUser + ";password="
				+ dbPassword;

		try {
			con = DriverManager.getConnection(connectionUrl);
			stmt = con.createStatement();
			return true;
		} catch (SQLException ex) {

			ex.printStackTrace();
			return false;
		}

	}
	
	
	public static List<cashier> getCashier(int cashierID) {
		
		int id;
		String name;
		int branchID;
		int isFired;
		ResultSet rs;
		List<cashier> ls = new ArrayList<>();
		
		try {
			ps = con.prepareStatement("Select * from cashiers");
//			ps.setInt(1, cashierID);
			rs = ps.executeQuery();
			while(rs.next()) {
				id = rs.getInt("cashiersID");
				name = rs.getString("name");
				branchID = rs.getInt("BranchID");
				isFired = rs.getInt("isFired");
				cashier a = new cashier(name,id);
				ls.add(a);
			}
			
			return ls;
			
		} catch(SQLException ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		SQLServer.dbConnect();
		List<cashier> c1 = SQLServer.getCashier(1);
		
		for(cashier a : c1) {
			System.out.println(a); 
		}
		
//		for (int i=0; i<5;i++) {
//			
//		}
		
	}
}
