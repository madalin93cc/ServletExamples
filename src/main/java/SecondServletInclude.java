/**
 * Created by Madalin.Colezea on 7/11/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SecondServletInclude extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Enumeration enume = request.getAttributeNames();
        while (enume.hasMoreElements()) {
            String attributeName = (String) enume.nextElement();
            out.println(attributeName + ": " +
                    request.getAttribute(attributeName) + "<BR>");
        }
    }
}
