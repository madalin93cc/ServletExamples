/**
 * Created by Madalin.Colezea on 7/10/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class HTTPHeadersServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Enumeration enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String header = (String) enumeration.nextElement();
            out.println(header + ": " + request.getHeader(header) + "<BR>");
        }
    }
}