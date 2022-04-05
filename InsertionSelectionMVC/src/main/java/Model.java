import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Model {
	private int id;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}

	/**
	 * communicate with database (model->database) controller will call this method
	 * (control -> model)
	 */
	public int insert() {
		Connection con;
		PreparedStatement pstmt;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

			pstmt = con.prepareStatement("insert into STUDENT values(?,?,?,?,?)");

			pstmt.setInt(1, this.id);
			pstmt.setString(2, this.name);
			pstmt.setInt(3, this.marks1);
			pstmt.setInt(4, this.marks2);
			pstmt.setInt(5, this.marks3);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("rowUpdated: " + rowUpdated);
			return 1;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

	/**
	 * communicate with database (model->database) controller will call this method
	 * (control -> model)
	 */
	public void select() {
		Connection con;
		PreparedStatement pstmt;
		ResultSet res;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

			pstmt = con.prepareStatement("select * from STUDENT where id = ?");

			pstmt.setInt(1, this.id);
			res = pstmt.executeQuery();

			while (res.next()) {
				this.id = res.getInt(1);
				this.name = res.getString(2);
				this.marks1 = res.getInt(3);
				this.marks2 = res.getInt(4);
				this.marks3 = res.getInt(5);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
