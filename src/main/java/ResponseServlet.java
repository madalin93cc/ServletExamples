/**
 * Created by Madalin.Colezea on 7/10/2014.
 */
import javax.servlet.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Enumeration;
public class ResponseServlet implements Servlet {
    public void init(ServletConfig config) throws ServletException {
    }
    public void destroy() {
    }
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>");
        out.println("ServletResponse");
        out.println("</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<B>Demonstrating the ServletResponse object</B>");
        out.println("<BR>");
        out.println("<BR>Server Port: " + request.getServerPort());
        out.println("<BR>Server Name: " + request.getServerName());
        out.println("<BR>Protocol: " + request.getProtocol());
        out.println("<BR>Character Encoding: " + request.getCharacterEncoding());
        out.println("<BR>Content Type: " + request.getContentType());
        out.println("<BR>Content Length: " + request.getContentLength());
        out.println("<BR>Remote Address: " + request.getRemoteAddr());
        out.println("<BR>Remote Host: " + request.getRemoteHost());
        out.println("<BR>Scheme: " + request.getScheme());
        Enumeration parameters = request.getParameterNames();
        while (parameters.hasMoreElements()) {
            String parameterName = (String) parameters.nextElement();
            out.println("<br>Parameter Name: " + parameterName);
            out.println("<br>Parameter Value: " +
                    request.getParameter(parameterName));
        }
        Enumeration attributes = request.getAttributeNames();
        while (attributes.hasMoreElements()) {
            String attribute = (String) attributes.nextElement();
            out.println("<BR>Attribute name: " + attribute);
            out.println("<BR>Attribute value: " + request.getAttribute(attribute));
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }
    public String getServletInfo() {
        return null;
    }
    public ServletConfig getServletConfig() {
        return null;
    }
}
