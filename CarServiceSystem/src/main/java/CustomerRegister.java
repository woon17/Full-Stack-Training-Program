

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerRegister
 */
public class CustomerRegister extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String username = req.getParameter("un");
		String password = req.getParameter("pwd");
		String cPassword = req.getParameter("cpwd");
		String email = req.getParameter("email");
		
		Model model = new Model();
		model.setCname(name);
		model.setCusername(username);
		model.setCpassword(cPassword);
		model.setCemail(email);
		
		int rowsUpdated =model.registerCustomer();
		
		if(rowsUpdated == 0) {
			resp.sendRedirect("/CarServiceSystem/customerRegisterFailure.html");
		}else {
			HttpSession session = req.getSession(true);// create a new session
			session.setAttribute("un", model.getCusername());
						
			resp.sendRedirect("/CarServiceSystem/customerRegisterSuccess.jsp");
		}
		}

	
	
	
}
