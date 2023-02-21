
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html"); // o/p as in form of text
       PrintWriter out = response.getWriter();
       String name=request.getParameter("n1");
       String pass=request.getParameter("p1");
       out.println("username is "+name+" password is "+pass);
       
        HttpSession session8=request.getSession();
        session8.setAttribute("name1", name);
        out.println("<a href='NewServlet1'>click here</a>");
    }
}
