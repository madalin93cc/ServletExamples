/**
 * Created by Madalin.Colezea on 7/10/2014.
 */
import javax.servlet.*;
import java.util.Enumeration;
import java.io.IOException;
public class RequestDemoServlet implements Servlet {
    public void init(ServletConfig config) throws ServletException {
    }

    public void destroy() {
    }

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        System.out.println("Server Port: " + request.getServerPort());
        System.out.println("Server Name: " + request.getServerName());
        System.out.println("Protocol: " + request.getProtocol());
        System.out.println("Character Encoding: " +
                request.getCharacterEncoding());
        System.out.println("Content Type: " + request.getContentType());
        System.out.println("Content Length: " + request.getContentLength());
        System.out.println("Remote Address: " + request.getRemoteAddr());
        System.out.println("Remote Host: " + request.getRemoteHost());
        System.out.println("Scheme: " + request.getScheme());
        Enumeration parameters = request.getParameterNames();
        while (parameters.hasMoreElements()) {
            String parameterName = (String) parameters.nextElement();
            System.out.println("Parameter Name: " + parameterName);
            System.out.println("Parameter Value: " +
                    request.getParameter(parameterName));
        }
        Enumeration attributes = request.getAttributeNames();
        while (attributes.hasMoreElements()) {
            String attribute = (String) attributes.nextElement();
            System.out.println("Attribute name: " + attribute);
            System.out.println("Attribute value: " +
                    request.getAttribute(attribute));
        }
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }
}
