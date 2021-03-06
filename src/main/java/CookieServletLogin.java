/**
 * Created by Madalin.Colezea on 7/11/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class CookieServletLogin extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sendLoginForm(response, false);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (login(userName, password)) {
//send cookie to the browser
            Cookie c1 = new Cookie("userName", userName);
            Cookie c2 = new Cookie("password", password);
            response.addCookie(c1);
            response.addCookie(c2);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
//response.sendRedirect does not work here.
// use a Meta tag to redirect to ContentServlet
            out.println("<META HTTP-EQUIV=Refresh CONTENT=0;URL=contentservlet>");
        }
        else {
            sendLoginForm(response, true);
        }
    }
    private void sendLoginForm(HttpServletResponse response, boolean
            withErrorMessage)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Login</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        if (withErrorMessage) {
            out.println("Login failed. Please try again.<BR>");
            out.println("If you think you have entered the correct user name" +
                    " and password, the cookie setting in your browser might be off." +
                    "<BR>Click <A HREF=InfoPage.html>here</A> for information" +
                    " on how to turn it on.<BR>");
        }
        out.println("<BR>");
        out.println("<BR><H2>Login Page</H2>");
        out.println("<BR>");
        out.println("<BR>Please enter your user name and password.");
        out.println("<BR>");
        out.println("<BR><FORM METHOD=POST>");
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>User Name:</TD>");
        out.println("<TD><INPUT TYPE=TEXT NAME=userName></TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD>Password:</TD>");
        out.println("<TD><INPUT TYPE=PASSWORD NAME=password></TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD ALIGN=RIGHT COLSPAN=2>");
        out.println("<INPUT TYPE=SUBMIT VALUE=Login></TD>");
        out.println("</TR>");
        out.println("</TABLE>");
        out.println("</FORM>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    public static boolean login(String userName, String password) {
        return true;
    }
}
