package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionManager {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		//register Driver class
		//Load Dynamically Driver class
		Class.forName("oracle.jdbc.OracleDriver");
		
		//create the connection object
		Connection con = null;
		//Windows
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","1998");
		
		//Mac
		//con DriverManager.getConnection("jdbc:oralce:thin:@localhost:1521:orcl","SYSTEM","1998");
		
		if(con != null) 
			System.out.println("Established");
			
		return con;
		
	}
	
}
