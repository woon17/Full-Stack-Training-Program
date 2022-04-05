

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// control collect all data from view and pass values to model by using setter
		int inputId = Integer.parseInt(req.getParameter("id"));
		String inputName = req.getParameter("name");
		int inputmarks1 = Integer.parseInt(req.getParameter("marks1"));
		int inputmarks2 = Integer.parseInt(req.getParameter("marks2"));
		int inputmarks3 = Integer.parseInt(req.getParameter("marks3"));
		
		Model model = new Model();
		model.setId(inputId);
		model.setName(inputName);
		model.setMarks1(inputmarks1);
		model.setMarks2(inputmarks2);
		model.setMarks3(inputmarks3);
		
		int rowsUpdated = model.insert();
		if(rowsUpdated == 0) {
			resp.sendRedirect("/InsertionSelectionMVC/failure.html");
		}else {
			resp.sendRedirect("/InsertionSelectionMVC/success.html");
		}
		
	}
	
}
