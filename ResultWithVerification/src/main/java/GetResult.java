
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleDriver;

/**
 * Servlet implementation class GetResult
 */
public class GetResult extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con;
		PreparedStatement pstmt;
		ResultSet res;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

			System.out.println("Read:");
			System.out.println("Enter the student id: ");
			pstmt = con.prepareStatement("select * from STUDENT where id = ?");
			int inputId = Integer.parseInt(req.getParameter("id"));

			pstmt.setInt(1, inputId);
			System.out.println(pstmt);
			System.out.println(pstmt.toString());
			res = pstmt.executeQuery();

//			String line = String.format("%70s", " ").replace(" ", "*");
//			System.out.println(line);
//			System.out.println(String.format("%10s %10s %10s %10s", "name", "marks1", "marks2", "marks3"));
			String name;
			int marks1;
			int marks2;
			int marks3;

			while (res.next()) {
				int id = res.getInt(1);
				name = res.getString(2);
				marks1 = res.getInt(3);
				marks2 = res.getInt(4);
				marks3 = res.getInt(5);
//				System.out.println(String.format("%s %10s %10s %10s %10s", id, name, marks1, marks2, marks3));
				PrintWriter pw = resp.getWriter();
				pw.println(String.format("%s %10s %10s %10s %10s", id, name, marks1, marks2, marks3));
//				pw.println(id + " " + name + " " + marks1 + " " + marks2 + " " + marks3);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
