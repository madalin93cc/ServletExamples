/**
 * Created by Madalin.Colezea on 7/11/2014.
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
public class AppLifeCycleEvent implements ServletContextListener {
    public void contextInitialized(ServletContextEvent cse) {
        ServletContext servletContext = cse.getServletContext();
        servletContext.setAttribute("dbUrl", "jdbc:mysql///Fred");
        System.out.println("Application initialized");
    }
    public void contextDestroyed(ServletContextEvent cse) {
        System.out.println("Application shut down");
    }
}
