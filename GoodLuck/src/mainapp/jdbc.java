/*package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
	Class.forName("oracle.jdbc.OracleDriver");
	
	
	Connection con = null;
	
	con = DriverManager.getConnection("jdbc:oralce:thin:@localhost:1521:xe","SYSTEM","1998");
	if(con != null) {
		System.out.println("Established");
	}
	
	}
}
*/