
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
//		System.out.println("-------------------------------");
		String id = req.getParameter("id");
//		PrintWriter pw = resp.getWriter();
//		pw.println("Hello everyone. I gave written this messgae directly from a servlet");

		if (id.length() == 0) {
			resp.sendRedirect("/ResultWithVerification/Error.html");
		}else {
			req.getServletContext().getRequestDispatcher("/GetResult").forward(req, resp);
		}
	}

}
