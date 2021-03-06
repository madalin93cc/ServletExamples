/**
 * Created by Colezea on 13/07/2014.
*/
import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Enumeration;
public class TrimFilter implements Filter {
    private FilterConfig filterConfig = null;
    public void destroy() {
        System.out.println("Filter destroyed");
        this.filterConfig = null;
    }
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Filter Trim");
        Enumeration enume = request.getParameterNames();
        while (enume.hasMoreElements()) {
            String parameterName = (String) enume.nextElement();
            String parameterValue = request.getParameter(parameterName);
            request.setAttribute(parameterName, parameterValue.trim());
        }
        chain.doFilter(request, response);
    }
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter initialized");
        this.filterConfig = filterConfig;
    }
}
