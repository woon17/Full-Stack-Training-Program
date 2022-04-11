

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServiceStatus
 */
public class UpdateServiceStatus extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		Model model = new Model();
		model.setCarowner(username);
		model.setCarstatus("true");
		int result = model.updateServiceStatus();
		if(result ==0) {
			PrintWriter pw = resp.getWriter();
			pw.println("updating failed");
			
		}else {
			PrintWriter pw = resp.getWriter();
			pw.println("updating successful");
		}
		
		
	}

}
