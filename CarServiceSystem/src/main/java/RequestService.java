
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RequestService
 */
public class RequestService extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String defaultStatus = "false";
		String service = req.getParameter("service");
		HttpSession session = req.getSession();
		String owner = (String) session.getAttribute("un");
		System.out.println("-----------------\nowner: " + owner);
		System.out.println("input service: " + service);
		Model model = new Model();
		model.setCarowner(owner);
		model.setCarservice(service);
		model.setCarstatus(defaultStatus);
		System.out.println("model for service: \n" + model);
		int serviceResult = model.addCarService();

		if (serviceResult == 0) {
			System.out.println("fail in updating service");
			resp.sendRedirect("/CarServiceSystem/carServiceAddFailure.html");
		} else {
			System.out.println("service updating successfully");
			resp.sendRedirect("/CarServiceSystem/carServiceAddSuccess.html");
		}

	}

}
