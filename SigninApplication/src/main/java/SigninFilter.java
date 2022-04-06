

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SigninFilter
 */
public class SigninFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SigninFilter() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.length() == 0 || password.length() == 0) {
			((HttpServletResponse) response).sendRedirect("/SigninApplication/incompleteError.html");
		}else if(!password.equals("")) {//password is not matched
			((HttpServletResponse) response).sendRedirect("/SigninApplication/invalidPassword.html");
		}else if() {//username is not in database
			((HttpServletResponse) response).sendRedirect("/SigninApplication/invalidUser.html");
		}
		else {
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
