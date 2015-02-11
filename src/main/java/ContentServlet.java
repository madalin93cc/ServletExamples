/**
 * Created by Madalin.Colezea on 7/11/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ContentServlet extends HttpServlet {
    public String loginUrl = "cookieloginservlet";
    /**Process the HTTP Get request*/
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws
            ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        int length = cookies.length;
        String userName = null;
        String password = null;
        for (int i=0; i<length; i++) {
            Cookie cookie = cookies[i];
            if (cookie.getName().equals("userName"))
                userName = cookie.getValue();
            else if (cookie.getName().equals("password"))
                password = cookie.getValue();
        }
        if (userName==null || password==null || false)
            response.sendRedirect(loginUrl);
// This is an authorized user, okay to display content
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Welcome</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("Welcome.");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    /**Process the HTTP Post request*/
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws
            ServletException, IOException {
        doGet(request, response);
    }
}
