

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String inputUsername = req.getParameter("username");
		String inputPassword = req.getParameter("password");
		
		Model model = new Model();
		model.setUsername(inputUsername);
		model.setPassword(inputPassword);
		System.out.println("adminlogin model: " + model);
		
		int loginResult = model.adminLoginVerify();
		System.out.println("admin login result: " + loginResult);
		
		if(loginResult == 0) {//username is valid but password is invalid
			resp.sendRedirect("/CarServiceSystem/adminInvalidPassword.html");
		}else if ( loginResult == -1) {// username is invalid
			resp.sendRedirect("/CarServiceSystem/adminInvalidUserName.html");
		}
		else {
//			resp.sendRedirect("/SigninApplication/loginSuccess.html");
			// put into session
			
			HttpSession session = req.getSession(true);// create a new session
			session.setAttribute("un", model.getUsername());
//			
//			System.out.println("singin.java: " + model);
//			
			resp.sendRedirect("/CarServiceSystem/adminLoginSuccess.jsp");
//			return;
		}
		
		
	}
}
