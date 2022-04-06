

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SIgnin
 */
public class SIgnin extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("pwd");
		Model model = new Model();
		model.setUsername(username);
		int rowsUpdated =model.register();
		
		if(rowsUpdated == 0) {
			resp.sendRedirect("/SigninApplication/failure.html");
		}else {
			resp.sendRedirect("/SigninApplication/success.html");
		}
	}
}
