
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
import javax.servlet.http.HttpSession;

import oracle.jdbc.OracleDriver;

/**
 * Servlet implementation class GetResult
 */
public class SelectById extends HttpServlet {
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
			Integer id;
			String name;
			Integer marks1;
			Integer marks2;
			Integer marks3;

			while (res.next()) {
				id = Integer.valueOf(res.getInt(1));
				name = res.getString(2);
				marks1 = Integer.valueOf(res.getInt(3));
				marks2 = Integer.valueOf(res.getInt(4));
				marks3 = Integer.valueOf(res.getInt(5));
				// put into session
				HttpSession session = req.getSession(true);
				session.setAttribute("id", id);
				session.setAttribute("name", name);
				session.setAttribute("marks1", marks1);
				session.setAttribute("marks2", marks2);
				session.setAttribute("marks3", marks3);
				resp.sendRedirect("/InsertionAndSelection/displayResult.jsp");
				return;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
