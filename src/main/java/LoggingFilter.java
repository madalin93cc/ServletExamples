/**
 * Created by Colezea on 13/07/2014.
 */
import javax.servlet.*;
import java.io.IOException;

public class LoggingFilter implements Filter {
    FilterConfig config = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init");
        config = filterConfig;
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
        config = null;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
        ServletContext sc = config.getServletContext();
        sc.log(servletRequest.getRemoteHost());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
