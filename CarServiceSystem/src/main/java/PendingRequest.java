

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PendingRequest
 */
public class PendingRequest extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Model model = new Model();
		List<Car> pendingServicesCars =  model.getPendingRequest();
		System.out.println("pendingServicesCars: \n" + pendingServicesCars);
		PrintWriter pw = resp.getWriter();
		for(Car c : pendingServicesCars) {
			pw.println(c);
		}
		
	}
}
