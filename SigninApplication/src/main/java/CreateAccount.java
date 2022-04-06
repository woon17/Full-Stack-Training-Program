

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccount
 */
public class CreateAccount extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String username = req.getParameter("un");
		String password = req.getParameter("pwd");
		String cPassword = req.getParameter("cpwd");
		String email = req.getParameter("email");
		System.out.println("CreateAccountServlet");
		System.out.println("name: "+ name + " username: " + username + " password: " + password + " cPassword: " + cPassword + " email: " + email);
		Model model = new Model();
		model.setName(name);
		model.setUsername(username);
		model.setEmail(email);
		int rowsUpdated =model.register();
		
		if(rowsUpdated == 0) {
			resp.sendRedirect("/SigninApplication/failure.html");
		}else {
			resp.sendRedirect("/SigninApplication/success.html");
		}
	}
}
