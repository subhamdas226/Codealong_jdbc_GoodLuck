package mainapp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;;
public class main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Register Here");
		System.out.println("Login");
		int x = Integer.parseInt(br.readLine());
		
		//objetcts
		RegisterDao registerdao = new RegisterDao();
		RegisterPojo registerpojo = new RegisterPojo();
		LoginPojo loginpojo = new LoginPojo();
		LoginDao logindao = new LoginDao();
		
		switch(x){
			case 1:{
				System.out.println("Enter the First Name");
				String fname = br.readLine();
				System.out.println("Enter the Last Name");
				String lname = br.readLine();
				System.out.println("Enter the User Name");
				String uname = br.readLine();
				System.out.println("Enter the Password");
				String pass = br.readLine();
				System.out.println("Enter the Email");
				String email = br.readLine();
				
				registerpojo.setFname(fname);
				registerpojo.setLname(lname);
				registerpojo.setUname(uname);
				registerpojo.setPass(pass);
				registerpojo.setEmail(email);
				
				registerdao.adduser(registerpojo);
				break;
				}
			case 2: 
				System.out.println("Enter the UserName");
				String name = br.readLine();
				System.out.println("Enter the Password");
				String pass = br.readLine();
				loginpojo.setUsername(name);
				loginpojo.setPassword(pass);
				
				if(logindao.validate(loginpojo)==true) {
					Luck luck = new Luck();
					luck.display();
				}
				else {
					System.out.println("Incorrect Username/password");
				}
				break;
		}

	}

}
