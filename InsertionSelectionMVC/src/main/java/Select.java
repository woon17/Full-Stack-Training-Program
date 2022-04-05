
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.jdbc.OracleDriver;

/**
 * Servlet implementation class Select
 */
public class Select extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("select controller");
		int inputId = Integer.parseInt(req.getParameter("id"));
		Model model = new Model();
		model.setId(inputId);
		model.select();
		
		// put into session
		HttpSession session = req.getSession(true);
		session.setAttribute("id", Integer.valueOf(model.getId()));
		session.setAttribute("name", Integer.valueOf(model.getName()));
		session.setAttribute("marks1", Integer.valueOf(model.getMarks1()));
		session.setAttribute("marks2", Integer.valueOf(model.getMarks2()));
		session.setAttribute("marks3", Integer.valueOf(model.getMarks3()));
		resp.sendRedirect("/InsertionSelectionMVC/PrintResult.jsp");
		return;
	}
}
