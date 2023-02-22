
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet2 extends HttpServlet {   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
       Cookie ck[] = request.getCookies(); // iterate cookies
        int i=0;
        String value="";
        if(ck!=null){
            String name = ck[i].getName();
            if(name.equals("name")){
                value=ck[i].getValue();
                out.print(value);
            }
            i++;
        }
        else{
        out.print("Hello "+ck[0].getValue());
        }
//        Cookie ck =new Cookie("name", "");
//        ck.setMaxAge(0);
//        response.addCookie(ck);  // logout the cookies
    }
}
