/**
 * Created by Madalin.Colezea on 7/10/2014.
 */
import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;
public class ResponseDemoServlet implements Servlet {
    ServletConfig servletConfig;
    public void init(ServletConfig config) throws ServletException {
        servletConfig = config;
    }
    public void destroy() {
    }
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        ServletContext servletContext = servletConfig.getServletContext();
        Enumeration attributes = servletContext.getAttributeNames();
        while (attributes.hasMoreElements()) {
            String attribute = (String) attributes.nextElement();
            System.out.println("Attribute name : " + attribute);
            System.out.println("Attribute value : " +
                    servletContext.getAttribute(attribute));
        }
    }
    public String getServletInfo() {
        return null;
    }
    public ServletConfig getServletConfig() {
        return null;
    }
}

