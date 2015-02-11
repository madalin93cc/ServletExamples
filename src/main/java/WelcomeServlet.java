/**
 * Created by Madalin.Colezea on 7/11/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class WelcomeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Welcome</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<P>Welcome to the Bulbul's and Boni's Web Site.</P>");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}