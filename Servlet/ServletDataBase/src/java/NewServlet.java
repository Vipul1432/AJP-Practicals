import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
       PrintWriter out =response.getWriter();
//       String name = request.getParameter("n");
//       String pass = request.getParameter("p");
//       out.print("Output of Html page "+name+" "+pass+"<br><br>");
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/class?zeroDateTimeBehavior=convertToNull","root","");
            out.println("connection is established"+"<br>");
            Statement st=cn.createStatement();
            
            
            ResultSet rs=st.executeQuery("select * from cla");
            while(rs.next()){
                out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"<br>");
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
            }
    }
}
