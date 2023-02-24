
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmployeeController extends AbstractController {
    
    public EmployeeController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
            ModelAndView mv = new ModelAndView();
            
//            String id = request.getParameter("t1");
//            String Name = request.getParameter("t2");
//            String salary = request.getParameter("t3");
//            
//            mv.addObject("heading","Student list");
//            mv.addObject("r",id);
//            mv.addObject("n",Name);
//            mv.addObject("s",salary);
            
            if(request.getParameter("submit")!=null)
            {
                String id = request.getParameter("t1");
                String Name = request.getParameter("t2");
                String salary = request.getParameter("t3");
                
                Employee ob = new Employee();
                ob.setId(Integer.parseInt(id));
                ob.setName(Name);
                ob.setSalary(Integer.parseInt(salary));
                
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_db", "root", "");
                    Statement st = cn.createStatement();
                    String qr = "insert into employee1 values('"+ob.getId()+"','"+ob.getName()+"','"+ob.getSalary()+"')";
                    int re = st.executeUpdate(qr);
                    if(re>0){
                        mv.addObject("msg", "save successfully");
                    }
                }
                catch(Exception e){
                    mv.addObject("msg", "Error "+e);
                }
            }
           
             try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate_db", "root", "");
                    Statement st = cn.createStatement();
                    String qr = "select *from employee1";
                    ResultSet rs = st.executeQuery(qr);
                    List<Employee> li = new ArrayList();
                    while(rs.next()){
                        Employee em = new Employee();
                        em.setId(rs.getInt("id"));
                        em.setName(rs.getString("name"));
                        em.setSalary(rs.getInt("salary"));
                        li.add(em);
                    }
                    
                }
                catch(Exception e){
                    mv.addObject("msg", "Error "+e);
                }
            
            return mv;
    }
    
}
