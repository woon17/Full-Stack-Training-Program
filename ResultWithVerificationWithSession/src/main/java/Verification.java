
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Verification
 */
public class Verification extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String id = req.getParameter("id");


		if (id.length() == 0) {
			resp.sendRedirect("/ResultWithVerificationWithSession/error.html");
		}else {
			req.getServletContext().getRequestDispatcher("/GetResult").forward(req, resp);
		}
	}

}
