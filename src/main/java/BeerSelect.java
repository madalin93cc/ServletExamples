/**
 * Created by Madalin.Colezea on 7/16/2014.
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {
    public void doPost(ServletRequest request, ServletResponse response) throws  IOException, ServletException{
        String c = request.getParameter("color");
        BeerExpert exp = new BeerExpert();
        List result = exp.getBrands(c);
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
    }
}
