

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckStatus
 */
public class CheckStatus extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String username = (String) session.getAttribute("un");
		System.out.println("CheckStatus username: " + username);
		Model model = new Model();
		model.setCarowner(username);
		int statusRes = model.checkStatus();
		if(statusRes!=0) {
			session.setAttribute("status", model.getCarstatus());
			resp.sendRedirect("/CarServiceSystem/checkCarUpdateSuccess.jsp");
			
		}else {
			resp.sendRedirect("/CarServiceSystem/checkCarUpdateFailure.html");
		}
		
		
		
	}
}
