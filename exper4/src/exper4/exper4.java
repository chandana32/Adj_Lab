package exper4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class exper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//establish the connection
			//DriverManager.getConnection(connectionURL, username, password);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
			
			//statement object creation
			Statement st = con.createStatement();
			
			//execution of sql statement and output is table which is represented as resultset in application
			ResultSet rs = st.executeQuery("select * from studs");
			
			System.out.println("regno\tname\tbranch");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
