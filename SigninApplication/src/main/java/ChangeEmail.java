
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChangeEmail
 */
public class ChangeEmail extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("newEmail");
		// do not set to true as we still using signin session
		HttpSession signInSession = req.getSession();
		
		
		Model model = new Model();
		model.setUsername((String) signInSession.getAttribute("un"));
		model.setEmail(email);
		
		int res =model.changeEmail();
		
		if(res == 0) {
			resp.sendRedirect("/SigninApplication/emailFailure.html");
		}else {
			resp.sendRedirect("/SigninApplication/emailSuccess.html");
		}
		
	}
}
