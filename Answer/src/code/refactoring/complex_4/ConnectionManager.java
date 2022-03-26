package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static Connection getConnection() {
		
		String url = "url";
		String id = "id";
		String pw = "password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
