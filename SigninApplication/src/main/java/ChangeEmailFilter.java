

import java.io.IOException;

import javax.net.ssl.SSLEngine;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ChangeEmailFilter
 */
public class ChangeEmailFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ChangeEmailFilter() {
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
//		request.setAttribute("un", request.getParameter("un"));
		System.out.println("changeEmail filter: username is " + request.getParameter("un"));
		System.out.println("changeEmail filter: username is " + request.getParameter("username"));
		if(request.getParameter("newEmail").length() == 0) {
			((HttpServletResponse) response).sendRedirect("/SigninApplication/newEmailEmpty.html");

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
