
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class NewServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html"); // o/p as in form of text
       
       PrintWriter out = response.getWriter();
       String name=request.getParameter("n1");
       String pass=request.getParameter("p1");
       out.println("username is "+name+" password is "+pass);
        Cookie ck = new Cookie("name", name);  // storing of cookies
        ck.setMaxAge(604800);
        response.addCookie(ck);
        
        out.println("<form action='NewServlet2' method='get'>");
        out.println("<input type='submit' value = 'go'>");
        out.println("</form>");
        
    }

}
