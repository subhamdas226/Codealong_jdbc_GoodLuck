package mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

	public boolean validate(LoginPojo loginpojo) throws SQLException, ClassNotFoundException {
		String username = loginpojo.getUsername();
		String password = loginpojo.getPassword();
		
		connectionManager con = new connectionManager();
		Statement st = con.getConnection().createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * from USERDETAILS");
		int flag = 0;
		while(rs.next()) 
		{
			
			if(username.equals(rs.getString("USERNAME")) && password.equals(rs.getString("PASSWORDS")))
			{
				con.getConnection().close();
				flag =1;
			}
			else {
				con.getConnection().close();
				flag=0;
			}
		}
		if(flag ==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
