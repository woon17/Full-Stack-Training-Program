
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisteredCustomers
 */
public class RegisteredCustomers extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Model model = new Model();
		
		List<Customer> allCustomers = model.printRegisteredCustomer();
		System.out.println("[RegisteredCustomers.java] allCustomers: \n" + allCustomers);
		
	
		if(allCustomers.size()==0) {
			resp.sendRedirect("/CarServiceSystem/registeredCustomersFailure.html");
		}else {
			PrintWriter pw = resp.getWriter();
			for(Customer c : allCustomers) {
				pw.println(c);
			}
//			resp.sendRedirect("/CarServiceSystem/registeredCustomersSuccess.html");
		}
		
	}

}
