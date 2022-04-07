import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	private String name;
	private String username;
	private String password;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int register() {
		Connection con;
		PreparedStatement pstmt;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

			pstmt = con.prepareStatement("insert into USERDETAILS values(?,?,?,?)");

			pstmt.setString(1, this.name);
			pstmt.setString(2, this.username);
			pstmt.setString(3, this.password);
			pstmt.setString(4, this.email);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("rowUpdated: " + rowUpdated);
			return 1;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public int login() {
		Connection con;
		PreparedStatement pstmt;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

			pstmt = con.prepareStatement("select * from USERDETAILS where USERNAME = ?");
			pstmt.setString(1, this.username);

			ResultSet res = pstmt.executeQuery();

			String passwordFromRes = "";
			if (res.next()) {
				passwordFromRes = res.getString(3);
				this.email = res.getString(4);
				
				if(this.password.equals(passwordFromRes)) {
					return 1;
				}else {
					return 0;
				}
			}else {
				return -1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 0;

	}
	

	public int changeEmail() {
		Connection con;
		PreparedStatement pstmt;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

			pstmt = con.prepareStatement("update USERDETAILS set EMAIL=? where USERNAME = ?");
			pstmt.setString(1, this.email);
			pstmt.setString(2, this.username);
	
			ResultSet res = pstmt.executeQuery();

			if (res.next()) {
				
				return 1;
			}else {
				return -1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return 0;

	}
	
	public String toString() {
		return "name: " + this.name + " ; username: " + this.username + " ; password: " + this.password +" ; email: " + this.email;
	}

}
