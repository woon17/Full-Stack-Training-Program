package jdbc;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class MyFirstJDBC {

	public static void showTableByFullQuery(Connection con){
		try {
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from STUDENT");
			String line = String.format("%70s", " ").replace(" ", "*");
			System.out.println(line);
			System.out.println(String.format("%3s %10s %10s %10s %10s", "id", "name", "marks1", "marks2", "marks3"));

			while (res.next()) {
				int id = res.getInt(1);
				String name = res.getString(2);
				int marks1 = res.getInt(3);
				int marks2 = res.getInt(4);
				int marks3 = res.getInt(5);
				System.out.println(String.format("%3s %10s %10s %10s %10s", id, name, marks1, marks2, marks3));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void getTableColumnInfo(Connection con) throws SQLException {
		try {

			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery("select * from STUDENT");
			ResultSetMetaData rsmd = res.getMetaData();
			System.out.println("");
			String line = String.format("%70s", " ").replace(" ", "*");
			System.out.println(line);
			System.out.println(String.format("%10s %10s", "columeName", "columeType"));
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println(String.format("%10s %10s", rsmd.getColumnName(i), rsmd.getColumnTypeName(i)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

	public static void tryCreate(Connection con) throws SQLException {
		try {
			System.out.println("Create:");
			PreparedStatement pstmt = con.prepareStatement("insert into STUDENT values(?,?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id: ");
			int inputId = sc.nextInt();
			System.out.println("Enter the student name: ");
			String inputName = sc.next();
			System.out.println("Enter the marks1: ");
			int inputmarks1 = sc.nextInt();
			System.out.println("Enter the marks2: ");
			int inputmarks2 = sc.nextInt();
			System.out.println("Enter the marks3: ");
			int inputmarks3 = sc.nextInt();
			pstmt.setInt(1, inputId);
			pstmt.setString(2, inputName);
			pstmt.setInt(3, inputmarks1);
			pstmt.setInt(4, inputmarks2);
			pstmt.setInt(5, inputmarks3);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("rowUpdated: " + rowUpdated);

			showTableByFullQuery(con);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

	public static void tryRead(Connection con) throws SQLException {
		try {
			System.out.println("Read:");
			System.out.println("Enter the student id: ");
			PreparedStatement pstmt = con.prepareStatement("select * from STUDENT where id = ?");
			Scanner sc = new Scanner(System.in);
			int inputId = sc.nextInt();
			pstmt.setInt(1, inputId);
			System.out.println(pstmt);
			System.out.println(pstmt.toString());
			ResultSet res = pstmt.executeQuery();

			String line = String.format("%70s", " ").replace(" ", "*");
			System.out.println(line);
			System.out.println(String.format("%10s %10s %10s %10s", "name", "marks1", "marks2", "marks3"));

			while (res.next()) {
				int id = res.getInt(1);
				String name = res.getString(2);
				int marks1 = res.getInt(3);
				int marks2 = res.getInt(4);
				int marks3 = res.getInt(5);
				System.out.println(String.format("%10s %10s %10s %10s", name, marks1, marks2, marks3));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

	public static void tryUpdate(Connection con) throws SQLException {
		try {
			System.out.println("Update:");
			PreparedStatement pstmt = con.prepareStatement("update STUDENT set marks1 =? where id =?");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id: ");
			int inputId = sc.nextInt();
			System.out.println("Enter the new marks1: ");
			int inputmarks1 = sc.nextInt();
			pstmt.setInt(1, inputmarks1);
			pstmt.setInt(2, inputId);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("rowUpdated: " + rowUpdated);

			showTableByFullQuery(con);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

	public static void tryDelete(Connection con) throws SQLException {
		try {
			System.out.println("Delete: ");
			PreparedStatement pstmt = con.prepareStatement("delete STUDENT where id =?");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id to be deleted: ");
			int inputId = sc.nextInt();
			pstmt.setInt(1, inputId);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("rowUpdated: " + rowUpdated);

			showTableByFullQuery(con);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

	}

	public static void tryUpdateTwoRowsByCommit(Connection con) throws SQLException {
		try {
			System.out.println("tryUpdateTwoRowsByCommit:");
//			PreparedStatement pstmt = con.prepareStatement("update STUDENT set marks1 =? where id =? or id =?");
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("update STUDENT set marks1 =? where id =?");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student1 id: ");
			int inputId1 = sc.nextInt();
			System.out.println("Enter the new marks1: ");
			int inputmarks1 = sc.nextInt();

			pstmt.setInt(1, inputmarks1);
			pstmt.setInt(2, inputId1);
			int row1 = pstmt.executeUpdate();

			pstmt = con.prepareStatement("update STUDENT set marks2 =? where id =?");
			System.out.println("Enter the student2 id: ");
			int inputId2 = sc.nextInt();
			System.out.println("Enter the new marks2: ");
			int inputmarks2 = sc.nextInt();
			pstmt.setInt(1, inputmarks2);
			pstmt.setInt(2, inputId2);
			int row2 = pstmt.executeUpdate();

			if (row1 > 0 && row2 > 0) {
				con.commit();
			}

			showTableByFullQuery(con);
		} catch (Exception e) {
			con.rollback();
			System.out.println("All the changes has been rolled back");
			e.printStackTrace();
		}  finally {
			con.close();
		}
	}

//	not working
	public static void tryUpdateTwoRowsAddBatch(Connection con) {
		try {
			System.out.println("tryUpdateTwoRowsAddBatch:");

			Statement stmt = con.createStatement();
			stmt.addBatch("update STUDENT set marks3=1 where id=1");
			stmt.addBatch("update STUDENT set marks3=2 where id=2");
			stmt.addBatch("update STUDENT set marks3=3 where id=3");
			stmt.executeBatch();
			showTableByFullQuery(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void tryUpdateTwoRowsByOneQuery(Connection con) {
		try {
			System.out.println("tryUpdateTwoRowsByOneQuery:");

			PreparedStatement pstmt = con
					.prepareStatement("update STUDENT set marks1 = case when id=1 then 3 when id = 2 then 4 end");

			pstmt.executeUpdate();
			showTableByFullQuery(con);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Connection con;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");

			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

//			getTableColumnInfo(con);
			showTableByFullQuery(con);
//			tryCreate(con);
//			tryRead(con);
//			tryUpdate(con);
//			tryDelete(con);

//			tryUpdateTwoRowsAddBatch(con);
//			tryUpdateTwoRowsByOneQuery(con);
			tryUpdateTwoRowsByCommit(con);
//			tryUpdateTwoRowsAddBatch(con);

		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
