import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       String name = request.getParameter("n1");
       String pass = request.getParameter("p1");
       out.println("Welcom your userid is "+name+" and password is "+pass);
       
       out.println("<a href='NewServlet1?uname="+name+"'>Go</a>");
    }
}
