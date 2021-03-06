/**
 * Created by Madalin.Colezea on 7/11/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class CookieServlet extends HttpServlet {
    /**Process the HTTP Get request*/
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie c1 = new Cookie("userName", "Helen");
        Cookie c2 = new Cookie("password", "Keppler");
        response.addCookie(c1);
        response.addCookie(c2);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Cookie Test</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("Please click the button to see the cookies sent to you.");
        out.println("<BR>");
        out.println("<FORM METHOD=POST>");
        out.println("<INPUT TYPE=SUBMIT VALUE=Submit>");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    /**Process the HTTP Post request*/
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws
            ServletException,IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Cookie Test</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<H2>Here are all the headers.</H2>");
        Enumeration enu = request.getHeaderNames();
        while (enu.hasMoreElements()) {
            String header = (String) enu.nextElement();
            out.print("<B>" + header + "</B>: ");
            out.print(request.getHeader(header) + "<BR>");
        }
        out.println("<BR><BR><H2>And, here are all the cookies.</H2>");
        Cookie[] cookies = request.getCookies();
        int length = cookies.length;
        for (int i=0; i<length; i++) {
            Cookie cookie = cookies[i];
            out.println("<B>Cookie Name:</B> " + cookie.getName() + "<BR>");
            out.println("<B>Cookie Value:</B> " + cookie.getValue() + "<BR>");
        }
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
