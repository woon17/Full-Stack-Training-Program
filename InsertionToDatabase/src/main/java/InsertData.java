
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

import oracle.jdbc.driver.OracleDriver;

/**
 * Servlet implementation class InsertData
 */
public class InsertData extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con;
		PreparedStatement pstmt;
		ResultSet res;
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver is registered successfully");
			con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "shufa");
			System.out.println("Connection is established successfully");

			pstmt = con.prepareStatement("insert into STUDENT values(?,?,?,?,?)");

			int inputId = Integer.parseInt(req.getParameter("id"));
			String inputName = req.getParameter("name");
			int inputmarks1 = Integer.parseInt(req.getParameter("marks1"));
			int inputmarks2 = Integer.parseInt(req.getParameter("marks2"));
			int inputmarks3 = Integer.parseInt(req.getParameter("marks3"));
			pstmt.setInt(1, inputId);
			pstmt.setString(2, inputName);
			pstmt.setInt(3, inputmarks1);
			pstmt.setInt(4, inputmarks2);
			pstmt.setInt(5, inputmarks3);
			int rowUpdated = pstmt.executeUpdate();
			System.out.println("rowUpdated: " + rowUpdated);
			if (rowUpdated == 0) {
				resp.sendRedirect("/InsertionToDatabase/failure.html");
			} else {
				resp.sendRedirect("/InsertionToDatabase/success.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
