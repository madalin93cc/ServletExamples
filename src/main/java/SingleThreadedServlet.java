/**
 * Created by Madalin.Colezea on 7/10/2014.
 */
import javax.servlet.*;
import java.io.*;
public class SingleThreadedServlet extends GenericServlet implements SingleThreadModel {
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        int counter = 0;
// get saved value
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("counter.txt"));
            counter = Integer.parseInt( reader.readLine() );
            reader.close();
        }
        catch (Exception e) {
        }
// increment counter
        counter++;
// save new value
        try {
            Thread thread = new Thread();
            thread.sleep(6000);
        }
        catch (InterruptedException e) {
        }
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("counter.txt"));
            writer.write(Integer.toString(counter));
            writer.close();
        }
        catch (Exception e) {
        }
        try {
            PrintWriter out = response.getWriter();
            out.println("You are visitor number " + counter);
        }
        catch (Exception e) {
        }
    }
}
