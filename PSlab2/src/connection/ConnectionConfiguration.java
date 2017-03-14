package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {
	
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/Kengus";
	
	public static final String USERNAME = "root";
	
	public static final String PASSWORD = "groot";
	
	public static Connection getConnection(){
		Connection connection = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}
	
}
