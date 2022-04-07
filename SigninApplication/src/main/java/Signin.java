

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Signin
 */
public class Signin extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("un");
		String password = req.getParameter("pwd");
		Model model = new Model();
		model.setUsername(username);
		model.setPassword(password);
		
		int res =model.login();
		
		if(res == 0) {//username is valid but password is invalid
			resp.sendRedirect("/SigninApplication/invalidPassword.html");
		}else if ( res == -1) {// username is invalid
			resp.sendRedirect("/SigninApplication/invalidUserName.html");
		}
		else {
//			resp.sendRedirect("/SigninApplication/loginSuccess.html");
			// put into session
			
			HttpSession session = req.getSession(true);// create a new session
			session.setAttribute("un", model.getUsername());
			session.setAttribute("email", model.getEmail());
			
			System.out.println("singin.java: " + model);
			
			resp.sendRedirect("/SigninApplication/validUser.jsp");
			return;
		}
	}
}
