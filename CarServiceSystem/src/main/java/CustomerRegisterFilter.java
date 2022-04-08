

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CustomerRegisterFilter
 */
public class CustomerRegisterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CustomerRegisterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		String name = request.getParameter("name");
		String username = request.getParameter("un");
		String password = request.getParameter("pwd");
		String cPassword = request.getParameter("cpwd");
		String email = request.getParameter("email");
		System.out.println("doFilter");
		System.out.println("name: "+ name + " username: " + username + " password: " + password + " cPassword: " + cPassword + " email: " + email);
		if(name.length() == 0 || username.length() == 0 || password.length() == 0 || cPassword.length() == 0 || email.length() == 0 ) {
			((HttpServletResponse) response).sendRedirect("/SigninApplication/dataIncompleteError.html");
		}else if(!password.equals(cPassword)) {
			((HttpServletResponse) response).sendRedirect("/SigninApplication/pwdCpwdNotMatchingError.html");
		}else {
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
