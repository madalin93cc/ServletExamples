/**
 * Created by Colezea on 13/07/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class TrimFilteredServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>User Input Form</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("<BR>Please enter your details.");
        out.println("<BR>");
        out.println("<BR><FORM METHOD=POST>");
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>First Name:</TD>");
        out.println("<TD><INPUT TYPE=TEXT NAME=firstName></TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD>Last Name:</TD>");
        out.println("<TD><INPUT TYPE=TEXT NAME=lastName></TD>");
        out.println("</TR>");
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
    public void doPost(HttpServletRequest request, HttpServletResponse
            response)
            throws ServletException, IOException {
        String firstName = (String) request.getAttribute("firstName");
        String lastName = (String) request.getAttribute("lastName");
        String userName = (String) request.getAttribute("userName");
        String password = request.getParameter("password");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Displaying Values</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<CENTER>");
        out.println("Here are your details.");
        out.println("<TABLE>");
        out.println("<TR>");
        out.println("<TD>First Name:</TD>");
        out.println("<TD>" + firstName + "</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD>Last Name:</TD>");
        out.println("<TD>" + lastName + "</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD>User Name:</TD>");
        out.println("<TD>" + userName + "</TD>");
        out.println("</TR>");
        out.println("<TR>");
        out.println("<TD>Password:</TD>");
        out.println("<TD>" + password + "</TD>");
        out.println("</TABLE>");
        out.println("</CENTER>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}
