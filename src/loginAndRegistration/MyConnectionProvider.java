package loginAndRegistration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements ConnectionProvider {
	
	static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			con = DriverManager.getConnection(connectionUrl);

			System.out.println("Connection established");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}