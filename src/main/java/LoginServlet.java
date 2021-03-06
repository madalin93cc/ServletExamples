/**
 * Created by Madalin.Colezea on 7/10/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class LoginServlet extends HttpServlet {
    private void sendLoginForm(HttpServletResponse response,
                               boolean withErrorMessage)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Login</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        if (withErrorMessage)
            out.println("Login failed. Please try again.<BR>");
        out.println("<BR>");
        out.println("<BR>Please enter your user name and password.");
        out.println("<BR><FORM METHOD=POST>");
        out.println("<BR>User Name: <INPUT TYPE=TEXT NAME=userName>");
        out.println("<BR>Password: <INPUT TYPE=PASSWORD NAME=password>");
        out.println("<BR><INPUT TYPE=SUBMIT VALUE=Submit>");
        out.println("</FORM>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sendLoginForm(response, false);
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (userName!=null && password!=null &&
                userName.equals("jamesb") && password.equals("007")) {
            response.sendRedirect("http://localhost:8080/madalinservlet-1.0-SNAPSHOT/multiplevalues");
        }
        else {
            response.sendError(response.SC_FORBIDDEN, "Login failed.");
        }
    }
}