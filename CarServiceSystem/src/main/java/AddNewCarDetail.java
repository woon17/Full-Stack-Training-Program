

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateCarDetail
 */
public class AddNewCarDetail extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String inputcarModel = req.getParameter("carModel");
		String inputcarType = req.getParameter("carType");
		String inputcarNum = req.getParameter("carNum");
		HttpSession session = req.getSession();
		String owner = (String) session.getAttribute("un");
		System.out.println("-----------------\nowner: " +owner );
		
		Model model = new Model();
		model.setCarmodel(inputcarModel);
		model.setCartype(inputcarType);
		model.setCarnum(inputcarNum);
		model.setCarowner(owner);
		int updateResult = model.addNewCarDetail();
		
		if (updateResult == 0) {
			resp.sendRedirect("/CarServiceSystem/carDetailUpdatedFail.html");
		}else {
			resp.sendRedirect("/CarServiceSystem/carDetailUpdatedSuccess.html");
		}
		
		
		
	}
}
