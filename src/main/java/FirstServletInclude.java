/**
 * Created by Madalin.Colezea on 7/11/2014.
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class FirstServletInclude extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Included Request Parameters</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<B>Included Request Parameters</B><BR>");
        RequestDispatcher rd =
                request.getRequestDispatcher("secondservleti?name=Madalin");
        rd.include(request, response);
        out.println("</BODY>");
        out.println("</HTML>");
    }
}