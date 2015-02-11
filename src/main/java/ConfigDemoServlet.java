/**
 * Created by Madalin.Colezea on 7/10/2014.
 */
import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class ConfigDemoServlet implements Servlet{
    ServletConfig servletconf;
    public void init(ServletConfig config){
        servletconf = config;
        Enumeration<String> parameters = config.getInitParameterNames();
        while (parameters.hasMoreElements()){
            String parameter = config.getInitParameter(parameters.nextElement());
            System.out.println("Parameter name : " + parameter);
            System.out.println("Parameter value : " + config.getInitParameter(parameter));
        }
    }
    public void destroy() {
    }
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
    }
    public String getServletInfo() {
        return null;
    }
    public ServletConfig getServletConfig() {
        return servletconf;
    }
}

