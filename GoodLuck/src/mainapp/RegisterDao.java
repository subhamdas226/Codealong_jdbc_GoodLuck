package mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	public void adduser(RegisterPojo registerpojo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String firstname = registerpojo.getFname();
		String lastname = registerpojo.getLname();
		String username  = registerpojo.getUname();
		String password = registerpojo.getPass();
		String email = registerpojo.getEmail();
		
		
		connectionManager cm = new connectionManager();
		
		//insert all details into the database
		String sql = "insert into USERDETAILS (FIRSTNAME,LASTNAME,USERNAME,PASSWORDS,EMAIL)VALUES(?,?,?,?,?)";
		
		//CREATE STATEMENT OBJECT
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setString(1, firstname);
		st.setString(2, lastname);
		st.setString(3, username);
		st.setString(4, password);
		st.setString(5, email);
		
		st.executeUpdate();
		cm.getConnection().close();
		
	}

}
