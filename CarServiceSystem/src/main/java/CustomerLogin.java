
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerLogin
 */
public class CustomerLogin extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String inputCname = req.getParameter("cusername");
		String inputcpassword = req.getParameter("cpassword");
		Model model = new Model();
		model.setCusername(inputCname);
		model.setCpassword(inputcpassword);
		
		System.out.println("customer login model: \n" + model);
			
		int customerLoginRes = model.cutomerLoginVerify();
		
		if(customerLoginRes == 0) {//username is valid but password is invalid
			resp.sendRedirect("/CarServiceSystem/customerInvalidPassword.html");
		}else if ( customerLoginRes == -1) {// username is invalid
			resp.sendRedirect("/CarServiceSystem/customerInvalidUserName.html");
		}
		else {
//			resp.sendRedirect("/SigninApplication/loginSuccess.html");
			// put into session
			
			HttpSession session = req.getSession();// create a old session
			session.setAttribute("un", model.getCusername());
//			
//			System.out.println("singin.java: " + model);
//			
			resp.sendRedirect("/CarServiceSystem/customerLoginSuccess.jsp");
			return;
		}
		
		
		
		
	}

}
